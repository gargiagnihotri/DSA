public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {50,55,95,101,34};
        int key = 101;

        int index = LinearSearch(arr, key);

        if (index == -1) {
            System.out.println(" element not found");
        }
        else {
            System.out.println("element found in index" +index);
        }
    }
    public static  int LinearSearch(int[] arr , int key) {
        for (int i=0 ; i <arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
    

