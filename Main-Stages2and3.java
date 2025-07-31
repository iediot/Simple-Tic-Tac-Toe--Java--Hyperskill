package tictactoe;

public class Main {
    /// --- Third version of the code ---
    /// These are the functions used in the third iteration of the code
    /// The first three verify if there are any winning combinations, and
    /// if so, they return the winner of that combination, while the third
    /// function checks if the grid is full.
    /*
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
        if ((ticTacToe[0][0] == ticTacToe[1][1] &&
                ticTacToe[1][1] == ticTacToe[2][2]) ||
                (ticTacToe[2][0] == ticTacToe[1][1] &&
                        ticTacToe[1][1] == ticTacToe[0][2]))
            return ticTacToe[1][1];
        return 0;
    }
    public static boolean isFull (char[][] ticTacToe) {
        for (char[] chars : ticTacToe)
            for (char aChar : chars)
                if (aChar == '_')
                    return false;
        return true;
    }
     */
    public static void main(String[] args) {
        /// --- Second version of the code ---
        /// I forgot to keep the first one commented out and instead refactored it directly.
        /// Either way, the first task was simple enough that it does not really need the
        /// code here; this task is also simple, no restrictions need to be made, some examples
        /// being the matrix does not need to only contain 'X', 'O' or '_'; the code does not
        /// yet need restrictions for not introducing wrong values, and the task is solved in
        /// a simple manner.
        /*
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char[][] ticTacToeGrid = new char[4][4];
        String input = scanner.nextLine();
        for (int i = 0; i < 9; i++)
                ticTacToeGrid[i / 3][i % 3] = input.charAt(i);
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(ticTacToeGrid[i][j] + " ");
            System.out.println("|");
        }
        System.out.println("---------");
        */
        /// --- Third version of the code ---
        /// This is the part of the main program that ensures the functionality
        /// of the entire program, while the before mentioned functions being used
        /// to ensure that that is the case. The program does not yet have restrictions,
        /// and the compiler can throw exceptions left and right, but that will be
        /// fixed in the following versions.
        /*
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int oCounter = 0, xCounter = 0;
        char[][] ticTacToeGrid = new char[4][4];
        String input = scanner.nextLine();
        for (int i = 0; i < 9; i++) {
            ticTacToeGrid[i / 3][i % 3] = input.charAt(i);
            if (input.charAt(i) == 'X')
                xCounter++;
            else if (input.charAt(i) == 'O')
                oCounter++;
        }
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(ticTacToeGrid[i][j] + " ");
            System.out.println("|");
        }
        System.out.println("---------");
        boolean oWins = false, xWins = false;
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
        if (xWins && oWins)
            System.out.println("Impossible");
        else if (xWins)
            System.out.println("X wins");
        else if (oWins)
            System.out.println("O wins");
        else if (isFull(ticTacToeGrid))
            System.out.println("Draw");
        else if (oCounter > xCounter || xCounter > oCounter + 1)
            System.out.println("Impossible");
        else
            System.out.println("Game not finished");
         */
    }
}
