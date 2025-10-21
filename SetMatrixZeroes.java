public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        
        for (int z = 0; z < rows; z++) {
            for (int y = 0; y < cols; y++) {
                if (matrix[z][y] == 0) {
                    zeroRows[z] = true;
                    zeroCols[y] = true;
                }
            }
        }

    
        for (int z = 0; z < rows; z++) {
            for (int y = 0; y < cols; y++) {
                if (zeroRows[z] || zeroCols[y]) {
                    matrix[z][y] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        SetMatrixZeroes obj = new SetMatrixZeroes();
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        obj.setZeroes(matrix);

        
        for (int z = 0; z < matrix.length; z++) {
            for (int y = 0; y < matrix[0].length; y++) {
                System.out.print(matrix[z][y] + " ");
            }
            System.out.println();
        }
    }
}