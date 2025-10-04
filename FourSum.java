import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int aim) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return result;

        Arrays.sort(nums); 

        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue; 

            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue; 

                int left = b + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[a] + nums[b] + nums[left] + nums[right];

                    if (sum == aim) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right]));

                        left++;
                        right--;

                        
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < aim) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,4,-4,-10,-2,3};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println("Quadruplets that sum to " + target + ":");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}