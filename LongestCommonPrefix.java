public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        String[] strs = {"interview","internet","internal"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }

        
        String prefix = strs[0];

        
        for (int w = 1; w < strs.length; w++) {
            
            while (strs[w].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}