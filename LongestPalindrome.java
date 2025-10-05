public class LongestPalindrome {
    
    public static String longestPalindrome(String w) {
        if (w == null || w.length() < 1) return "";

        int start = 0, end = 0;
        
        for (int i = 0; i < w.length(); i++) {
            int line1 = expandAroundCenter(w, i, i);       
            int line2 = expandAroundCenter(w, i, i + 1);   
            int len = Math.max(line1, line2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return w.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input1 = "ghghhh";
        System.out.println("Longest Palindromic Substring of \"" + input1 + "\": " + longestPalindrome(input1));

        String input2 = "yjyjyyy";
        System.out.println("Longest Palindromic Substring of \"" + input2 + "\": " + longestPalindrome(input2));
    }
}