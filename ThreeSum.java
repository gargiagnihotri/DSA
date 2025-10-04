import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int q = 0; q < nums.length - 2; q++) {
            
            if (q > 0 && nums[q] == nums[q - 1]) continue;

            int left = q + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[q] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[q], nums[left], nums[right]));

                    
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } 
                else if (sum < 0) {
                    left++; 
                } 
                else {
                    right--; 
                }
            }
        }

        return result;
    }

    
    public static void main(String[] args) {
        int[] nums = {10,101,-10,-8,-9,5,4};

        List<List<Integer>> triplets = threeSum(nums);
        System.out.println(triplets);
    }
}