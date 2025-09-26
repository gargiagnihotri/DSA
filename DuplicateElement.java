public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {22,14,22,10};

        System.out.println("Duplicate element in array");

        for(int i =0; i<arr.length; i++)   {
            for(int j= i +1; j < arr.length; j++)   {
                if (arr[i] == arr[j])   {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}