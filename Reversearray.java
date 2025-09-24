public class Reversearray {
    public static void main(String[] args) {
        
        int[] arr = {5,4,3,2,1};

        reverse(arr);
        
        int start = 0 , end = arr.length-1;

        System.out.print (" Reverse array:");
        for ( int num: arr) {
            System.out.print(num + " ");
        }
    
        

        while ( start > end )
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        }
    }

