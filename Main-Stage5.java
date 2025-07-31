package tictactoe;

public class Main {
    public static void gridPrinter (char[][] grid) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println("|");
        }
        System.out.println("---------");
    }
    public static boolean isFull (char[][] ticTacToe) {
        for (char[] chars : ticTacToe)
            for (char aChar : chars)
                if (aChar == ' ')
                    return false;
        return true;
    }
    public static char isWinningLine(char[][] ticTacToe, int i) {
        if (ticTacToe[0][i] == ticTacToe[1][i] && ticTacToe[1][i] == ticTacToe[2][i])
            return ticTacToe[0][i];
        return 0;
    }
    public static char isWinningRow(char[][] ticTacToe, int i) {
        if (ticTacToe[i][0] == ticTacToe[i][1] && ticTacToe[i][1] == ticTacToe[i][2])
            return ticTacToe[i][0];
        return 0;
    }
    public static char areDiagonalsWinning(char[][] ticTacToe) {
        if ((ticTacToe[0][0] == ticTacToe[1][1] && ticTacToe[1][1] == ticTacToe[2][2]) ||
                (ticTacToe[2][0] == ticTacToe[1][1] && ticTacToe[1][1] == ticTacToe[0][2]))
            return ticTacToe[1][1];
        return 0;
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int round = 1;
        boolean oWins = false, xWins = false;
        char[][] ticTacToeGrid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToeGrid[i][j] = ' ';
            }
        }
        gridPrinter(ticTacToeGrid);
        while (!isFull(ticTacToeGrid)) {
            String xStr = scanner.next(), yStr = scanner.next();
            int x, y;
            try {
                x = Integer.parseInt(xStr);
                y = Integer.parseInt(yStr);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (x < 1 || x > 3 || y < 1 || y > 3)
                System.out.println("Coordinates should be from 1 to 3!");
            else if (ticTacToeGrid[x - 1][y - 1] == 'X' ||
                    ticTacToeGrid[x - 1][y - 1] == 'O')
                System.out.println("This cell is occupied! Choose another one!");
            else if (ticTacToeGrid[x - 1][y - 1] == ' ' && round % 2 == 1) {
                ticTacToeGrid[x - 1][y - 1] = 'X';
                round++;
            }
            else if (ticTacToeGrid[x - 1][y - 1] == ' ' && round % 2 == 0) {
                ticTacToeGrid[x - 1][y - 1] = 'O';
                round++;
            }
            for (int i = 0; i < 3; i++) {
                if (isWinningRow(ticTacToeGrid, i) == 'X' ||
                        isWinningLine(ticTacToeGrid, i) == 'X' ||
                        areDiagonalsWinning(ticTacToeGrid) == 'X')
                    xWins = true;
                if (isWinningRow(ticTacToeGrid, i) == 'O' ||
                        isWinningLine(ticTacToeGrid, i) == 'O' ||
                        areDiagonalsWinning(ticTacToeGrid) == 'O')
                    oWins = true;
            }
            gridPrinter(ticTacToeGrid);
            if (xWins) {
                System.out.println("X wins");
                break;
            }
            else if (oWins) {
                System.out.println("O wins");
                break;
            }
            else if (isFull(ticTacToeGrid)) {
                System.out.println("Draw");
                break;
            }
        }
    }
}
