public class Nk {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] Bd = new boolean[n][n];
        knight(Bd, 0, 0, 4);
    }

    static void knight(boolean[][] Bd, int row, int col, int k) {
        if (k == 0) {
            display(Bd);
            System.out.println();
            return;
        }

        if (row == Bd.length - 1 && col == Bd.length) {
            return;
        }

        if (col == Bd.length) {
            knight(Bd, row + 1, 0, k);
            return;
        }

        if (isSafe(Bd, row, col)) {
            Bd[row][col] = true;
            knight(Bd, row, col + 1, k - 1);
            Bd[row][col] = false;
        }

        knight(Bd, row, col + 1, k);
    }

    private static boolean isSafe(boolean[][] Bd, int row, int col) {
        if (isValid(Bd, row - 2, col - 1)) {
            if (Bd[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(Bd, row - 1, col - 2)) {
            if (Bd[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(Bd, row - 2, col + 1)) {
            if (Bd[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(Bd, row - 1, col + 2)) {
            if (Bd[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] Bd, int row, int col) {
        if (row >= 0 && row < Bd.length && col >= 0 && col < Bd.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] Bd) {
        for(boolean[] row : Bd) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
