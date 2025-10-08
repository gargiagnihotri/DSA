public class RemoveDuplicateFromArray {

    public static int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;

        
        int j = 0;

        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i]; 
            }
        }

        
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {10,10,30,3,3,5,55,55};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}