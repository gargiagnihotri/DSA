public class ProductSubarray {
    public static int highestProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int recentMax = nums[0];   
        int recentMin = nums[0];   
        int ans = nums[0];       

        for (int i = 1; i < nums.length; i++) {
            int tempMax = recentMax;

            recentMax = Math.max(Math.max(nums[i], recentMax * nums[i]), recentMin * nums[i]);
            recentMin = Math.min(Math.min(nums[i], tempMax * nums[i]), recentMin * nums[i]);

            if (recentMax > ans) {
                ans = recentMax;
            }
        }
        return ans;
    }
        public static void main(String[] args) {
        int[] nums = {7,-10,4,8,-9};
        System.out.println("Product Subarray: " + highestProduct(nums)); 
        
    }
}