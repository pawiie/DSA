import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {


        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r-1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathreturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathreturn(p + 'D', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathreturn(p + 'R', r, c-1));
        }

        return list;
    }

    static ArrayList<String> pathreturnDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathreturnDiagonal(p + 'D', r-1, c-1));
        }

        if (r > 1) {
            list.addAll(pathreturnDiagonal(p + 'V', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathreturnDiagonal(p + 'H', r, c-1));
        }

        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }
}
