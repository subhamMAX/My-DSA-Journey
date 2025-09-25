
        public class NQueens {

            static int N;

            public static void main(String[] args) {
                N = 4; // change N here
                int[][] board = new int[N][N];

                if (!solveNQueens(board, 0)) {
                    System.out.println("No solution exists");
                }
            }

            // Recursive solver
            static boolean solveNQueens(int[][] board, int col) {
                if (col >= N) { // all queens placed
                    printBoard(board);
                    return true;
                }

                boolean res = false;
                for (int i = 0; i < N; i++) {
                    if (isSafe(board, i, col)) {
                        board[i][col] = 1;  // place queen
                        res = solveNQueens(board, col + 1) || res;
                        board[i][col] = 0;  // backtrack
                    }
                }
                return res;
            }

            // Check if placing queen at (row, col) is safe
            static boolean isSafe(int[][] board, int row, int col) {
                int i, j;

                // check left side of row
                for (i = 0; i < col; i++)
                    if (board[row][i] == 1) return false;

                // check upper diagonal
                for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
                    if (board[i][j] == 1) return false;

                // check lower diagonal
                for (i = row, j = col; i < N && j >= 0; i++, j--)
                    if (board[i][j] == 1) return false;

                return true;
            }

            // Print solution board
            static void printBoard(int[][] board) {
                System.out.println("Solution:");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print((board[i][j] == 1 ? "Q " : ". "));
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }


    
    

