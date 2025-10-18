public class SpiralMatrix {
    
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];
        int index = 0;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while(top <= bottom && left <= right) {
    
            for(int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            top++;

            
            for(int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;

            if(top <= bottom) {
            
                for(int i = right; i >= left; i--) {
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            if(left <= right) {
    
                for(int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {12,15,17},
            {13,11,18},
            {20,21,22}
        };

        int[] spiral = spiralOrder(matrix);

        for(int num : spiral) {
            System.out.print(num + " ");
        }
    }
}