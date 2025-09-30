public class Subarray {
    static void findSubarray(int[] arr, int target) {
        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end]; 

              while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

             if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("subarray not found in given sum");
    }

    public static void main(String[] args) {
        int[] arr = {35,22,12,45,0};
        int target = 57;

        findSubarray(arr, target);
    }
}
