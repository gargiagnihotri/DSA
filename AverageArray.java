public class AverageArray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        // Print result
        System.out.println("The average of array elements is: " + average);
    }
}
