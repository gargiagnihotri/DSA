public class LongestSubstring {
    
    public static int LongestSubstring(String s) {
        int[] endIndex = new int[128]; 
        for (int a = 0; a < 128; a++) {
            endIndex[a] = -1;
        }
        
        int highestlength = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (endIndex[ch] >= start) {
                start = endIndex[ch] + 1;
            }
            endIndex[ch] = end;
            highestlength = Math.max(highestlength, end - start + 1);
        }
        return highestlength;
    }

    public static void main(String[] args) {
    
        System.out.println(LongestSubstring("nnftdhjjv")); 

        
        System.out.println(LongestSubstring("zzzz")); 

        
        System.out.println(LongestSubstring("erfgvjbj")); 
    }
}