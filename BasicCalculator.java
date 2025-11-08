public class BasicCalculator {
    
    public int calculate(String s) {
        int[] stack = new int[s.length()];
        int top = -1;
        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; 
                result += number * sign;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                
                stack[++top] = result;
                stack[++top] = sign;
                
                result = 0;
                sign = 1;
            } else if (c == ')') {
            
                int prevSign = stack[top--];
                int prevResult = stack[top--];
                result = prevResult + prevSign * result;
            }
    
        }

        return result;
    }

    
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();

        String s1 = "1 + 1";
        System.out.println("Result 1: " + calc.calculate(s1)); 

        String s2 = " 2-1 + 2 ";
        System.out.println("Result 2: " + calc.calculate(s2)); 

        String s3 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println("Result 3: " + calc.calculate(s3)); 
    }
}