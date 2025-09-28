import java.util.*;

public class MergeSortedArray {
    
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void merge(int[] arr1, int[] arr2, int g, int y) {
        int gap = g + y;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            int i, j;

            
            for (i = 0; i + gap < g; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }

            
            for (j = (gap > g) ? gap - g : 0; i < g && j < y; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            
            if (j < y) {
                for (j = 0; j + gap < y; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {51,53,55,57,59};
        int[] arr2 = {52,54,56,58};

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
