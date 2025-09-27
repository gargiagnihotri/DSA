public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {15,0,14,0,16,0,100,0};

        moveZeroToEnd(arr);
           
        for (int num:arr)   {
            System.out.print(num + "  ");
        }
    }
       
    public static void moveZeroToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != index) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
                index++;
            }
        }
    }
}
    
        

