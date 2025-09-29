public class KadaneAlgorithm {
    public static int maxSubarraySum(int[] arr) {
        
        int result = Integer.MIN_VALUE;
        int recentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            
            recentSum += arr[i];

           if (recentSum > result) {
                result = recentSum;
            }

           if (recentSum < 0) {
                recentSum = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-100,-88,-9,10,45,-65};
        System.out.println("Maximum Subarray Sum = " + maxSubarraySum(arr));
    }
}
