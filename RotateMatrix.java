public class RotateMatrix {
    
    static void rotate90(int[][] matrix) {
        int n = matrix.length;

    
        for (int x = 0; x < n; x++) {
            for (int z = x; z < n; z++) {
                int temp = matrix[x][z];
                matrix[x][z] = matrix[z][x];
                matrix[z][x] = temp;
            }
        }

        
        for (int x = 0; x < n; x++) {
            for (int z = 0, k = n - 1; z < k; z++, k--) {
                int temp = matrix[x][z];
                matrix[x][z] = matrix[x][k];
                matrix[x][k] = temp;
            }
        }
    }

    
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int[][] matrix = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate90(matrix);

        System.out.println("\nMatrix after rotation of 90 degree:");
        printMatrix(matrix);
    }
}