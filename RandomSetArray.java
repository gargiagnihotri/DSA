
import java.util.Random;

public class RandomSetArray {
    private int[] arr;
    private int size;
    private Random rand;

    
    public RandomSetArray() {
        arr = new int[100]; 
        size = 0;
        rand = new Random();
    }

    
    public boolean insert(int value) {
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return false; 
            }
        }

        
        arr[size] = value;
        size++;
        return true;
    }


    public boolean remove(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                
                arr[i] = arr[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    
    public int getRandom() {
        if (size == 0) throw new IllegalStateException("empty set !");
        int index = rand.nextInt(size);
        return arr[index];
    }

    
    public static void main(String[] args) {
        RandomSetArray set = new RandomSetArray();
        System.out.println(set.insert(100));  
        System.out.println(set.remove(20));  
        System.out.println(set.insert(30));  
        System.out.println(set.getRandom()); 
        System.out.println(set.remove(10));  
        System.out.println(set.insert(20));  
        System.out.println(set.getRandom()); 
    }
}