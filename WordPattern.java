public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;


        String[] map = new String[26]; 

        
        boolean[] used = new boolean[words.length];

        for (int a = 0; a < pattern.length(); a++) {
            char c = pattern.charAt(a);
            int index = c - 'a';

            if (map[index] == null) {
            
                for (int b = 0; b < map.length; b++) {
                    if (map[b] != null && map[b].equals(words[a])) {
                        return false;
                    }
                }
                map[index] = words[a];
            } else {
                
                if (!map[index].equals(words[a])) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abaa", "dog cat dog dog")); 
        System.out.println(wordPattern("abbb", "dog cat cat cat")); 
        System.out.println(wordPattern("aaaa", "dog dog dog dog")); 
        System.out.println(wordPattern("abba", "dog dog dog dog")); 
    }
}