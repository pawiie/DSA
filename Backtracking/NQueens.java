public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] chessboard = new boolean[n][n];
        System.out.println(Queens(chessboard, 0));
    }

    static int Queens(boolean[][] chessboard, int row) {
        if (row == chessboard.length) {
            display(chessboard);
            System.out.println();
            return 1;
        }

        int count = 0;

        
        for (int col = 0; col < chessboard.length; col++) {
            
            if(isSafe(chessboard, row, col)) {
                chessboard[row][col] = true;
                count += Queens(chessboard, row + 1);
                chessboard[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] chessboard, int row, int col) {
        
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col]) {
                return false;
            }
        }

        
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(chessboard[row-i][col-i]) {
                return false;
            }
        }

        
        int maxRight = Math.min(row, chessboard.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(chessboard[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] chessboard) {
        for(boolean[] row : chessboard) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
