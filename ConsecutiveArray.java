import java.util.Arrays;

public class ConsecutiveArray {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        
        Arrays.sort(nums);

        int longest = 1;
        int recentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] == nums[i - 1]) continue;

            if (nums[i] == nums[i - 1] + 1) {
                
                recentStreak++;
            } else {
            
                longest = Math.max(longest, recentStreak);
                recentStreak = 1;
            }
        }

        return Math.max(longest, recentStreak);
    }

    public static void main(String[] args) {
        int[] arr = {56,100,35,99,7};
        System.out.println("Longest Consecutive Sequence : " + longestConsecutive(arr));
    }
}