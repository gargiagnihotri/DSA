public class MissingArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5};
        int n = nums.length;
        int letsum = n* (n+1) /2;
        int realsum = 0;

        for( int i = 0 ; i <n ; i++) {
           realsum = realsum + nums[i]; 
        }
        int Missing = letsum - realsum;
        System.out.println("Missing array" + Missing);
    }
}