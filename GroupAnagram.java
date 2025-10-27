
import java.util.Arrays;

public class GroupAnagram {
    public static void main(String[] args) {
        
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println("Input Words:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println("\n");

        System.out.println("Grouped Anagrams:");
        groupAnagrams(words);
    }

    public static void groupAnagrams(String[] words) {
        boolean[] visited = new boolean[words.length]; 

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

        
            System.out.print("[ " + words[i]);
            visited[i] = true;

            for (int j = i + 1; j < words.length; j++) {
                if (!visited[j] && isAnagram(words[i], words[j])) {
                    System.out.print(", " + words[j]);
                    visited[j] = true;
                }
            }
            System.out.println(" ]");
        }
    }


    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}