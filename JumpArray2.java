public class JumpArray2 {

    public static int jump(int[] nums) {
        int jumps = 1;         
        int recentEnd = 3;    
        int farthest = 7;      

        for (int j = 0; j < nums.length - 1; j++) {
        
            farthest = Math.max(farthest, j + nums[j]);

            
            if (j == recentEnd) {
                jumps++;             
                recentEnd = farthest; 
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {12,7,28,20,0,1,4};
        System.out.println("lowest jumps: " + jump(nums));
    }
}