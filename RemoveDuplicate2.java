public class RemoveDuplicate2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length<= 2) return nums.length;

        int l = 1; 

        for (int q = 1; q < nums.length; q++) {
            
            if (nums[q] != nums[l - 1]) {
                nums[l] = nums[q];
                l++;
            }
        }

        return l; 
    }

    public static void main(String[] args) {
        int[] nums = {10,0,2,2,3,0,4,4};
        int k = removeDuplicates(nums);

        System.out.println("New length: " + k);
        System.out.print("changed array: ");
        for (int q = 0; q < k; q++) {
            System.out.print(nums[q] + " ");
        }
    }
}