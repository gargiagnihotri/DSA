import java.util.Arrays;
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int biggestStreak = 1;
        int recentStreak = 1;

            for (int k = 1; k < nums.length; k++) {
            
            if (nums[k] == nums[k - 1]) {
                continue;
            }
    
            else if (nums[k] == nums[k - 1] + 1) {
                recentStreak++;
            }
            
            else {
                biggestStreak = Math.max(biggestStreak, recentStreak);
                recentStreak = 1;
            }
        }
         return Math.max(biggestStreak, recentStreak);
    }

    public static void main(String[] args) {
        int[] nums1 = {10,8,9,66,55,3,4};
        System.out.println("Output 1: " + longestConsecutive(nums1)); 

        int[] nums2 = {0,4,8,10,9,7,5,45};
        System.out.println("Output 2: " + longestConsecutive(nums2)); 

        int[] nums3 = {23,78,0,10,1,2,3};
        System.out.println("Output 3: " + longestConsecutive(nums3)); 
    }
}