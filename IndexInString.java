public class IndexInString {

    public static void main(String[] args) {
        String firststring = "gargiwingargi";
        String secondstring = "gargiw";

        int result = findIndex(firststring, secondstring);
        System.out.println(result);  
    }

    public static int findIndex(String firststring, String secondstring) {
        char[] h = firststring.toCharArray(); 
        char[] n = secondstring.toCharArray();   

        
        for (int e = 0; e <= h.length - n.length; e++) {
            int r = 0;

            
            while (r < n.length && h[e + r] == n[r]) {
                r++;
            }


            if (r == n.length) {
                return e; 
            }
        }

        
        return -1;
    }
}