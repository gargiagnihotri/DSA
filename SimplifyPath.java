public class SimplifyPath {
    public static String simplifyPath(String path) {
        
        String[] parts = path.split("/");
        String[] stack = new String[parts.length]; 
        int top = -1; 

        for (String dir : parts) {
            if (dir.equals("") || dir.equals(".")) {
            
                continue;
            } else if (dir.equals("..")) {
                
                if (top >= 0) {
                    top--;
                }
            } else {
        
                stack[++top] = dir;
            }
        }

        if (top == -1) {
            return "/";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            result.append("/").append(stack[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
    
        String path1 = "/gift/";
        String path2 = "/.flower./";
        String path3 = "/gift//pink/";
        

        System.out.println(path1 + " → " + simplifyPath(path1)); 
        System.out.println(path2 + " → " + simplifyPath(path2)); 
        System.out.println(path3 + " → " + simplifyPath(path3)); 
        
    }
}