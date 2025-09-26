public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {101,102,103,105};

        int n = arr.length +1;
        int first = arr[0];
        int last = arr[0];

        for (int num : arr)  {
            if (num >last)  {
                last = num;
            }
        }

        int expectedsum = (first + last) * n /2;

        int actualsum=0;
        for (int num :arr)  {
            actualsum += num;
        }
        int missing = expectedsum - actualsum;
        System.err.println("missing number:" + missing);
    }
}
