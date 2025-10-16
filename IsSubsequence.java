public class IsSubsequence {
    
    public static void main(String[] args) {
        String s = "gargi";
        String t = "goaorogoi";

        boolean result = isSubsequence(s, t);
        System.out.println(result);  
    }

    public static boolean isSubsequence(String s, String t) {
        int e = 0; 
        int p = 0; 

        
        while (e < s.length() && p < t.length()) {
            if (s.charAt(e) == t.charAt(p)) {
                e++; 
            }
            p++; 
        }

    
        return e == s.length();
    }
}