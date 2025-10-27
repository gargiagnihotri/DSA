
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

        
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("First String  : " + str1);
        System.out.println("Second String : " + str2);

        
        if (isAnagram(str1, str2)) {
            System.out.println(" Output: Both strings are anagrams.");
        } else {
            System.out.println(" Output: Both strings are not anagrams.");
        }
    }

    
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        return Arrays.equals(arr1, arr2);
    }
}