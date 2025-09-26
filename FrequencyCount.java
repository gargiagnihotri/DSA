
import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10,11,44,99,44,10,99};

        
        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " → " + count);
                count = 1; 
            }
        }

        
        System.out.println(arr[arr.length - 1] + " → " + count);
    }
}
