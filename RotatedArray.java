public class RotatedArray {
    
    public static int search(int[] arr, int aim) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            
            if (arr[mid] == aim) {
                return mid;
            }

            
            if (arr[low] <= arr[mid]) {
                
                if (aim >= arr[low] && aim < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            else {
                
                if (aim > arr[mid] && aim<= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; 
    }


    public static void main(String[] args) {
        int[] arr = { 8,4,7,3,1};
        int aim = 7;

        int result = search(arr, aim);

        if (result != -1) {
            System.out.println("Element " + aim + " found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}