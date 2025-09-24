public class Reversearray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};

        reverse(arr);

        System.out.println ("Reversed array");
        for(int num:arr){ 
        
            
            
        System.out.println(num + " ");}}
        public static void reverse ( int[] arr){
        int i=0 , j =arr.length-1 , temp;    
        
        while ( i < j )
        {
             temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        
        
        }
}

