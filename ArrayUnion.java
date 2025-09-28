import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {100,101,102,103,106};
        int[] arr2 = {100,106,104,104,102};

        List<Integer> union = new ArrayList<>();

         for (int num : arr1) {
            if (!union.contains(num)) {
                union.add(num);
            }
        }

         for (int num : arr2) {
            if (!union.contains(num)) {
                union.add(num);
            }
        }

        System.out.println("Union (unique elements): " + union);
    }
}
