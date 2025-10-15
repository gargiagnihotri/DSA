public class ValidPalindrome{
    public static void main(String[] args) {
        String s = "the yash,the mohit,the gargi";
        boolean result = Palindrome(s);
        System.out.println(result);  
    }

    public static boolean Palindrome(String s) {
        
        s = s.toLowerCase();

        
        char[] arr = s.toCharArray();
        StringBuilder clean = new StringBuilder();

        for (char c : arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                clean.append(c);
            }
        }

        
        char[] cleanArr = clean.toString().toCharArray();

    
        int left = 0;
        int right = cleanArr.length - 1;

        while (left < right) {
            if (cleanArr[left] != cleanArr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}