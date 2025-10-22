public class RansomNote {
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

    
        for (int j = 0; j < magazine.length(); j++) {
            count[magazine.charAt(j) - 'a']++;
        }


        for (int j = 0; j < ransomNote.length(); j++) {
            count[ransomNote.charAt(j) - 'a']--;
            if (count[ransomNote.charAt(j) - 'a'] < 0) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        
        System.out.println(canConstruct("z", "x"));    
        System.out.println(canConstruct("zz", "zz")); 
        System.out.println(canConstruct("zx", "zzx")); 
    }
}