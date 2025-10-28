import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;

        int start = nums[0];

        for (int h = 1; h < nums.length; h++) {
            
            if (nums[h] != nums[h - 1] + 1) {
                
                if (start == nums[h - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[h - 1]);
                }
                
                start = nums[h];
            }
        }

        
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,9,4,6,25,0,9,8};
        int[] nums2 = {1,4,6,5,8,9,4,3};
        int[] nums3 = {1,0,9,6,4,3,4};

        System.out.println("Output 1: " + summaryRanges(nums1));
        System.out.println("Output 2: " + summaryRanges(nums2));
        System.out.println("Output 3: " + summaryRanges(nums3));
    }
}