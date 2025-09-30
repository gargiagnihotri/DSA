import java.util.Arrays;

public class ClosestElement {
    static void findnearestPair(int[] arr, int target) {
        Arrays.sort(arr); 

        int left = 0, right = arr.length - 1;
        int nearestSum = Integer.MAX_VALUE;
        int pair1 = -1, pair2 = -1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            
            if (Math.abs(target - sum) < Math.abs(target - nearestSum)) {
                nearestSum = sum;
                pair1 = arr[left];
                pair2 = arr[right];
            }

            if (sum > target) {
                right--; 
            } else {
                left++;  
            }
        }

        System.out.println("Pair: (" + pair1 + ", " + pair2 + "), Closest Sum = " + nearestSum);
    }

    public static void main(String[] args) {
        int[] arr = {35,77,57,100,97};
        int target = 88;

        findnearestPair(arr, target);
    }
}