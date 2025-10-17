public class MinimumSizeSubarray {
    
    public static int minimumSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minimumLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 1;

        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                minimumLength = Math.min(minimumLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return  0 ;
    }

    public static void main(String[] args) {
        
        int[] nums1 = {12,3,2,14,15};
        int target1 = 2;
        System.out.println(minimumSubArrayLen(target1, nums1)); 

        
        int[] nums2 = {12,12,1};
        int target2 = 10;
        System.out.println(minimumSubArrayLen(target2, nums2)); 

        
    }
}