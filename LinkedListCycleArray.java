public class LinkedListCycleArray {
    
    public static void main(String[] args) {
    
        int[] next = {1, 2, 3, 1}; 
        System.out.println(hasCycle(next)); 
    }

    public static boolean hasCycle(int[] next) {
        
        int slow = 0;
        int fast = 0;

        while (true) {
            
            if (slow == -1 || next[slow] == -1) return false;
            slow = next[slow];

    
            if (fast == -1 || next[fast] == -1) return false;
            fast = next[fast];
            if (fast == -1 || next[fast] == -1) return false;
            fast = next[fast];

        
            if (slow == fast) return true;
        }
    }
}
