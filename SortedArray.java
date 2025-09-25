public class SortedArray {
    public static void main(String[] args) {
    int[] arr = {10,20,90,40,70};

    if (sorted(arr)) {
        System.out.println("array is shorted");
    }
    else {
        System.out.println("array is not shorted");
       }
    }

    public static boolean sorted( int[] arr)
    {
        for( int i=0; i< arr.length-1; i++)
        {
            if( arr[i] > arr[i+1]) 
               return false;
          }
        return true;
    }
}
