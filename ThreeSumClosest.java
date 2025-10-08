import java.util.*;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; 

        for (int k = 0; k < n - 2; k++) {
            int left = k + 1;
            int right = n - 1;

            while (left < right) {
                int recentSum = nums[k] + nums[left] + nums[right];

                
                if (Math.abs(recentSum - target) < Math.abs(recentSum - target)) {
                    closestSum = recentSum;
                }

        
                if (recentSum < target) {
                    left++;
                } else if (recentSum > target) {
                    right--;
                } else {
                    
                    return recentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {-12,13,-14,-15,-18};
        int target1 = 1;
        System.out.println("closest Sum: " + threeSumClosest(nums1, target1));

        int[] nums2 = {1,3,8};
        int target2 = 1;
        System.out.println("Closest Sum: " + threeSumClosest(nums2, target2));
    }
}