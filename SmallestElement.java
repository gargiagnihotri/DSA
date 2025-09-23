public class SmallestElement {
    public static void main(String[] args) {
        
        int[] arr = {25, 47, 3, 19, 8, 55, 12};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}
    

