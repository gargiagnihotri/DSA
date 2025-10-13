public class ProductOfArray {
    public static int[] productofarray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
    
        result[0] = 1;
        for (int p = 1; p < n; p++) {
            result[p] = result[p - 1] * nums[p - 1];
        }
        

        int tail = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * tail;
            tail *= nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,12,15,-5,2,4};
        int[] result1 = productofarray(nums1);
        System.out.print("Output: ");
        for (int value : result1) {
            System.out.print(value + " ");
        }

        System.out.println();

        int[] nums2 = {-8,-1,-2,2,3,6};
        int[] result2 = productofarray(nums2);
        System.out.print("Output: ");
        for (int value : result2) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] nums3 = {-8,-1,-2,2,3,6};
        int[] result3 = productofarray(nums3);
        System.out.print("Output: ");
        for (int value : result3) {
            System.out.print(value + " ");
        }
    }
}