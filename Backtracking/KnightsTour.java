// ❌ Aplha's Solution ❌
public class KnightsTour {
    // Arrays representing possible moves for the knight
    private static int[] pathRow1 = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] pathCol1 = {1, 2, 2, 1, -1, -2, -2, -1};

    // Method to find the Knight's Tour
    public static boolean findKnightTour(int[][] visited, int row, int col, int move) {
        // Check if the tour is complete (64 moves)
        if (move == 63) {
            // Print the chessboard when the tour is complete
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(visited[i][j] + " ");
                }
                System.out.println();
            }
            return true; // Tour completed successfully
        } else {
            // Try each possible move
            for (int index = 0; index < pathRow1.length; index++) {
                int rowNew = row + pathRow1[index];
                int colNew = col + pathCol1[index];
                
                // Check if the move is valid
                if (isValidMove(visited, rowNew, colNew)) {
                    move++;
                    visited[rowNew][colNew] = move;
                    
                    // Recursively try the next move
                    if (findKnightTour(visited, rowNew, colNew, move)) {
                        return true; // Move successful
                    }
                    
                    move--;
                    visited[rowNew][colNew] = 0; // Backtrack if the move is unsuccessful
                }
            }
        }
        return false; // No valid move found
    }

    // Helper method to check if the move is valid
    private static boolean isValidMove(int[][] visited, int rowNew, int colNew) {
        // Check if the move is within the bounds and the cell is not visited
        return (rowNew >= 0) && (rowNew < 8) && (colNew >= 0) && (colNew < 8) && (visited[rowNew][colNew] == 0);
    }

    public static void main(String[] args) {
        
        
        // Create a 2D array to represent the chessboard
        int[][] visited = new int[8][8];

        // Start the tour from the initial position (0, 0)
        visited[0][0] = 0;
        findKnightTour(visited, 0, 0, 0);
    }
}
