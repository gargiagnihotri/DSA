import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        
        int[][] intervals = { {10,45}, {15,30}, {30,40}, {11,88} };

        int[][] result = merge(intervals);

        System.out.println("Input Intervals:");
        for (int[] interval : intervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        System.out.println("\nMerged Intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    public static int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] temp = new int[intervals.length][2];
        int index = 0;  
        temp[0] = intervals[0];  

        for (int m = 1; m < intervals.length; m++) {

            if (intervals[m][0] <= temp[index][1]) {
                
                temp[index][1] = Math.max(temp[index][1], intervals[m][1]);
            } else {
                
                index++;
                temp[index] = intervals[m];
            }
        }

        int[][] result = new int[index + 1][2];
        for (int m = 0; m <= index; m++) {
            result[m] = temp[m];
        }

        return result;
    }
}