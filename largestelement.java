public class largestelement {
    public static void main(String[] args) {
        
        int[] arr = {10, 45, 32, 67, 23, 89, 54};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
