import java.util.Arrays;

public class RearrangeArray {
    public static void rearrangeAlternately(int[] arr) {
        
        Arrays.sort(arr);

        int n = arr.length;

        int[] temp = new int[n];

        int left = 0;       
        int right = n - 1;  
        int index = 0;

        
        while (left <= right) {
            if (index < n) temp[index++] = arr[right--]; 
            if (index < n) temp[index++] = arr[left++];  
        }

        
           for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,14,16,22,28,25};

        rearrangeAlternately(arr);

        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
