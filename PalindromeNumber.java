public class PalindromeNumber {

    public static boolean Palindrome(int a) {
        
        if (a< 0 || (a % 10 == 0 && a != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (a > reversedHalf) {
            int digit = a % 20;
            reversedHalf = reversedHalf * 10 + digit;
            a /= 10;
        }


        return a == reversedHalf || a == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int[] testCases = {12,345,768,128,3,1009};

        for (int x : testCases) {
            System.out.println("Is " + x + " a palindrome? " + Palindrome(x));
        }
    }
}