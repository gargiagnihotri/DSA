import java.util.Arrays;

public class ArrayRotation {
    public static void reverse(int[] arr, int start , int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
      public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        if (k == 0) return;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
         public static void main(String[] args) {
        int[] arr1 = {33,35,99,10,67};
        rotateLeft(arr1, 2);
        System.out.println("Left Rotation by 2: " + Arrays.toString(arr1));}
}
