

public class BinarySearch {
    public static void main(String[] args) {
      int[]arr ={21,22,23,24,25} ;
      
      int key = 24;
      int index = binarysearch(arr , key);

      if (index == -1)    {
        System.out.println("element not found");
      }
      else {
        System.err.println("element found at index: " + index);
      }
    }
    public static int binarysearch(int[] arr,int key)  
    {
        int low = 0;
        int high = arr.length -1;

        while (low<= high)  {
            int mid= (low + high) /2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key)  {
                low=mid+1;
            }
            else {
                high =mid-1;
            }

        }
        return -1;
    }
}
