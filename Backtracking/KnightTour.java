// ❌ This solution is for n*n , here n can be anything ❌
public class KnightTour {
    private int[] pathRow1 = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] pathCol1 = {1, 2, 2, 1, -1, -2, -2, -1};
    private int n;

    public KnightTour(int n) {
        this.n = n;
    }

    public boolean findKnightTour(int[][] visited, int row, int col, int move) {
        if (move == n * n) {
            // Print the chessboard when the tour is complete
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(visited[i][j] + ", ");
                }
                System.out.println();
            }
            return true;
        } else {
            for (int index = 0; index < pathRow1.length; index++) {
                int rowNew = row + pathRow1[index];
                int colNew = col + pathCol1[index];

                if (isValidMove(visited, rowNew, colNew)) {
                    move++;
                    visited[rowNew][colNew] = move;

                    if (findKnightTour(visited, rowNew, colNew, move)) {
                        return true;
                    }

                    move--;
                    visited[rowNew][colNew] = 0; // Backtrack
                }
            }
        }
        return false;
    }

    private boolean isValidMove(int[][] visited, int rowNew, int colNew) {
        return (rowNew >= 0) && (rowNew < n) && (colNew >= 0) && (colNew < n) && (visited[rowNew][colNew] == 0);
    }

    public static void main(String[] args) {
        int n = 8; // Change this value for different chessboard sizes
        KnightTour knightTour = new KnightTour(n);
        int[][] visited = new int[n][n];

        // Starting from the top-left corner
        visited[0][0] = 1;

        // Start the tour from the initial position (0, 0)
        if (!knightTour.findKnightTour(visited, 0, 0, 1)) {
            System.out.println("Solution does not exist.");
        }
    }
}
