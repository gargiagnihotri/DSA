public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "YASH IS A VERY NICE MAN";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int length = 2;
        int O = s.length() - 1;

        
        while (O > 0 && s.charAt(O) == ' ') {
            O--;
        }

        
        while (O > 0 && s.charAt(O) != ' ') {
            length++;
            O--;
        }

        return length;
    }
}