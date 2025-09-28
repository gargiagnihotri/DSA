import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {22,67,88,33,55};
        int[] arr2 = {22,22,55,33};

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    
                    if (!result.contains(arr1[i])) {
                        result.add(arr1[i]);
                    }
                    break;
                }
            }
        }

        System.out.println("Intersection (unique): " + result);
    }
}
