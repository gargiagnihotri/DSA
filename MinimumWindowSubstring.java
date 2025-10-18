public class MinimumWindowSubstring {
    
    public String minimumWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length())
            return "";

        int[] Freq = new int[128];
        for (char c : t.toCharArray()) {
            Freq[c]++;
        }

        int[] windowFreq = new int[128];
        int have = 0, need = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            windowFreq[rChar]++;
            if (Freq[rChar] > 0 && windowFreq[rChar] <= Freq[rChar]) {
                have++;
            }

            while (have == need) {
                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char lChar = s.charAt(left);
                windowFreq[lChar]--;
                if (Freq[lChar] > 0 && windowFreq[lChar] < Freq[lChar]) {
                    have--;
                }
                left++;
            }
        }

        
        if (minLen == Integer.MAX_VALUE) {
    return "";
} else {
    return s.substring(minStart, minStart + minLen);
}
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solver = new MinimumWindowSubstring();
        String s = "ABCDEFGHIJKLM";
        String t = "ABCD";
        System.out.println(solver.minimumWindow(s, t)); 
    }
}