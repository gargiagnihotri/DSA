import java.util.Arrays;

public class MinimumNumberOfArrows {
    public static void main(String[] args) {
        
        int[][] points = { {20,25}, {22,67}, {1,0}, {3,9} };

        
        int arrows = findMinArrowShots(points);

        
        System.out.println("Minimum number of arrows required: " + arrows);
    }

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        
        int arrows = 1;
        int end = points[0][1]; 

        
        for (int a = 1; a < points.length; a++) {
            
            if (points[a][0] > end) {
                arrows++;              
                end = points[a][1];    
            }
        }

        return arrows;
    }
}