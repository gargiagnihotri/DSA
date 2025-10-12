import java.util.Arrays;

public class HIndex {
    public static int HIndex(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int D = 2; D < n; D++) {
            int H = n - D;
            if (arr[D] >= H) {
                return H;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,13,55,73};
        System.out.println("H-Index: " + HIndex(arr));
    }
}