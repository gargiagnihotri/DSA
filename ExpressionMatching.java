public class ExpressionMatching {

    public static boolean Match(String o, String r) {
        int g= o.length();
        int y = r.length();

        
        boolean[][] dp = new boolean[g + 1][y+ 1];
        dp[0][0] = true; 

        
        for (int p = 1; p <= y; p++) {
            if (r.charAt(p - 1) == '*') {
                dp[0][p] = dp[0][p- 2];
            }
        }

        
        for (int h = 1; h <= g; h++) {
            for (int j = 1; j <= y; j++) {
                char sc = o.charAt(h - 1);
                char pc = r.charAt(j - 1);

                if (pc == '.' || pc == sc) {
                    dp[h][j] = dp[h - 1][j - 1]; 
                } else if (pc == '*') {
                    dp[h][j] = dp[h][j - 2]; 
                    char prev = r.charAt(j - 2);
                    if (prev == '.' || prev == sc) {
                        dp[h][j] = dp[h][j] || dp[h - 1][j]; 
                    }
                }
            }
        }

        return dp[g][y];
    }

    
    public static void main(String[] args) {
        String s1 = "nh", p1 = "n";
        String s2 = "nn", p2 = "n*";
        String s3 = "hb", p3 = ".*";

        System.out.println("string question 1: " + Match(s1, p1)); 
        System.out.println(" string question 2: " + Match(s2, p2)); 
        System.out.println(" string question 3: " + Match(s3, p3)); 
    }
}