public class EqualArray {
    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {80,81,82,83,84};
        int[] b = {80,81,82,83,84};
        int[] c = {81,82,80,84,83};

        System.out.println(EqualArray.areEqual(a, b)); 
        System.out.println(EqualArray.areEqual(a, c)); 
    }
}
