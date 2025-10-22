public class IsomorphicString {
    
    public static boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;

        
        int[] mapS = new int[256];  
        int[] mapT = new int[256];  


        for (int i = 0; i < 256; i++) {
            mapS[i] = -1;
            mapT[i] = -1;
        }

        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            
            if (mapS[c1] == -1 && mapT[c2] == -1) {
                mapS[c1] = c2;
                mapT[c2] = c1;
            }
        
            else if (mapS[c1] != c2 || mapT[c2] != c1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t)); 

        s = "foo";
        t = "bar";
        System.out.println(isIsomorphic(s, t)); 

        s = "paper";
        t = "title";
        System.out.println(isIsomorphic(s, t)); 
    }
}