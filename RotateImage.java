public class RotateImage {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        
        for (int v = 0; v < n; v++) {
            for (int k = v; k < n; k++) {
                int temp = matrix[v][k];
                matrix[v][k] = matrix[k][v];
                matrix[k][v] = temp;
            }
        }

    
        for (int v = 0; v < n; v++) {
            for (int k = 0; k < n / 2; k++) {
                int temp = matrix[v][k];
                matrix[v][k] = matrix[v][n - 1 - k];
                matrix[v][n - 1 - k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {21, 22, 23},
            {24, 25, 26},
            {27, 28, 29}
        };

        rotate(matrix); 

        System.out.println("Rotated Image:");
        for (int v = 0; v < matrix.length; v++) {
            for (int k = 0; k < matrix[v].length; k++) {
                System.out.print(matrix[v][k] + " ");
            }
            System.out.println();
        }
    }
}