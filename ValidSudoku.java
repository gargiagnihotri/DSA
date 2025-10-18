public class ValidSudoku {

    public boolean ValidSudoku(char[][] board) {
        
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue; 
                
                int num = board[r][c] - '1'; 
                
                
                if (rows[r][num]) return false;
                rows[r][num] = true;
                
            
                if (cols[c][num]) return false;
                cols[c][num] = true;
                
                
                int boxIndex = (r / 3) * 3 + c / 3;
                if (boxes[boxIndex][num]) return false;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        ValidSudoku solution = new ValidSudoku();
        char[][] board = {
            {'9','8','.','.','5','.','.','.','.'},
            {'4','.','.','2','6','9','.','.','.'},
            {'.','1','3','.','.','.','.','6','.'},
            {'9','.','.','.','1','.','.','.','7'},
            {'4','.','.','7','.','5','.','.','2'},
            {'8','.','.','.','4','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        
        System.out.println(" Sudoku board valid? " + solution.ValidSudoku(board));
    }
}