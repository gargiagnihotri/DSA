public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        

        int n = nums.length ;
        int [] res = new int [n];
        int prefix = 1 ;

        for (int i = 0 ; i<n ; i++) {
            res[i] =  prefix ;
            prefix *= nums[i];

        }
         int sufix = 1;
         for (int i = n-1 ; i>=0 ; i--) {
            res[i]  *= sufix ;
            sufix *= nums[i];
         }
        for (int i = 0 ; i<n ; i++) {
            System.out.println( res [i] + " ");
        }
        
        }
    }
