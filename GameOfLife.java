public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};
            for (int w = 0; w < m; w++) {
            for (int q = 0; q < n; q++) {
                int liveNeighbors = 0;

            
                for (int k = 0; k < 8; k++) {
                    int ni = w + x[k], nj = q + y[k];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && (board[ni][nj] & 1) == 1) {
                        liveNeighbors++;
                    }
                }

            
                if ((board[w][q] & 1) == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[w][q] = 2;  
                }

                
                if ((board[w][q] & 1) == 0 && liveNeighbors == 3) {
                    board[w][q] = 3; 
                }
            }
        }

    
        for (int w = 0; w < m; w++) {
            for (int q = 0; q < n; q++) {
                if (board[w][q] == 2) board[w][q] = 0;
                if (board[w][q] == 3) board[w][q] = 1;
            }
        }
    }


    public static void main(String[] args) {
        GameOfLife obj = new GameOfLife();

        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        System.out.println("Input:");
        printBoard(board);

        obj.gameOfLife(board);

        System.out.println("\nOutput:");
        printBoard(board);
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}