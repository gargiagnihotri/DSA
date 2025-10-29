import java.util.*;

public class InsertInterval {
    public static void main(String[] args) {
        
        int[][] intervals = { {10,45}, {35,55}};
        int[] newInterval = {20,35};

        int[][] result = insert(intervals, newInterval);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int k = 0;
        int n = intervals.length;

        while (k < n && intervals[k][1] < newInterval[0]) {
            result.add(intervals[k]);
            k++;
        }

        while (k < n && intervals[k][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[k][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[k][1]);
            k++;
        }
        result.add(newInterval);

        while (k < n) {
            result.add(intervals[k]);
            k++;
        }

        return result.toArray(new int[result.size()][]);
    }
}