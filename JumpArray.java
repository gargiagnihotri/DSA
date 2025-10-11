public class JumpArray {
    public static boolean Jump(int[] nums) {
        int limit = 0; 

        for (int j = 0; j < nums.length; j++) {
            
            if (j > limit) {
                return false;
            }

            
            limit = Math.max(limit, j + nums[j]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {23,12,10,1,4,2};
        int[] nums2 = {0,7,23,12,1,2};

        System.out.println("array 1: " + Jump(nums1));
        System.out.println("array 2: " + Jump(nums2)); 
    }
}