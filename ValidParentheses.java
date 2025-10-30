public class ValidParentheses {
    public static boolean Valid(String s) {
    
        char[] stack = new char[s.length()];
        int top = -1; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } 

            else {
            
                if (top == -1) return false;

                char topChar = stack[top--];

                
                if ((ch == ')' && topChar != '(') ||
                    (ch == '}' && topChar != '{') ||
                    (ch == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        
        return top == -1;
    }

    public static void main(String[] args) {
    
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        

        System.out.println(s1 + " → " + Valid(s1)); 
        System.out.println(s2 + " → " + Valid(s2)); 
        System.out.println(s3 + " → " + Valid(s3)); 
        
    }
}