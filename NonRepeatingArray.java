public class NonRepeatingArray {
    public static void main(String[] args) {
        int[] arr = {12,14,33,33,12};

        int n = arr.length;
        int nonRepeating = -1;

        for (int i = 0; i < n;i++)  {
            boolean repeating = false;

            for(int j = 0; j < n; j++)  {
                if(i!= j && arr[i] == arr[j])    {
                    repeating = true;
                    break;
                }
            }
            if ( !repeating)   {
                nonRepeating = arr[i];
                break;

            }
        }
        if (nonRepeating == -1)   {
            System.out.println("No non repeating element");
        }
        else  {
            System.out.println("non repeating element" + nonRepeating);
        }
    }
}
