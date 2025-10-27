
public class HappyNumber {
    public static void main(String[] args) {
        int num = 19; 
        System.out.println("Number: " + num);

        if (isHappy(num)) {
            System.out.println(" Output: " + num + " is a Happy Number.");
        } else {
            System.out.println("Output: " + num + " is NOT a Happy Number.");
        }
    }

    
    public static boolean isHappy(int n) {
        int[] visited = new int[1000]; 
        int index = 0;

        while (n != 1 && !contains(visited, n)) {
            visited[index++] = n; 
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static boolean contains(int[] arr, int target) {
        for (int val : arr) {
            if (val == target) {
                return true;
            }
        }
        return false;
    }
}