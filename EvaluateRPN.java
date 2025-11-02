public class EvaluateRPN {
    
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;

        for (String token : tokens) {
            
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack[top--]; 
                int a = stack[top--]; 
                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break; 
                }
                stack[++top] = result; 
            } else {
            
                stack[++top] = Integer.parseInt(token);
            }
        }

        return stack[top]; 
    }


    public static void main(String[] args) {
        EvaluateRPN evaluator = new EvaluateRPN();
        
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Result 1: " + evaluator.evalRPN(tokens1)); 

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Result 2: " + evaluator.evalRPN(tokens2)); 

        String[] tokens3 = {"10", "6", "9", "3", "/", "-", "*"};
        System.out.println("Result 3: " + evaluator.evalRPN(tokens3)); 
    }
}