  public class MajorityElement {
    static int findMajorityElement(int[] arr) {
        int person= 0, count = 0;

        for (int num : arr) {
            if (count == 0) {
                person = num;
                count = 1;
            } else if (num == person) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == person) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return person;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,5,5,6,5,5};
        int result = findMajorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
        }
    }
}