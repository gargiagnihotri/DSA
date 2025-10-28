
public class ContainsDuplicateII {
    public static boolean containscloseDuplicate(int[] nums, int k) {
        
        for (int q = 0; q < nums.length; q++) {
            for (int w = q + 1; w < nums.length; w++) {
                
                if (nums[q] == nums[w]) {
                    
                    if (Math.abs(q - w) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {10,99,99,8,6,5,5,5,10};
        int k1 = 5;
        System.out.println(" Output 1 : " + containscloseDuplicate(nums1, k1));
        

        int[] nums2 = {68,94,96,99};
        int k2 = 1;
        System.out.println(" Output 2 : " + containscloseDuplicate(nums2, k2));
        

        int[] nums3 = {0,0,10,2,10,1};
        int k3 = 5;
        System.out.println(" Output 3 : " + containscloseDuplicate(nums3, k3));
        
    }
}