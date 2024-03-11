public class RatMazeProblem {

    // Method to print the solution matrix
    public static void printway(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    

    // Method to solve the maze and print the solution
    public static boolean solvemaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];

        // Check if the maze has a solution
        if (solvemazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution exists:");
            printway(sol); // Print the solution matrix
            return true;
        } else {
            System.out.println("Solution does not exist");
            return false;
        }
    }


    // Method to check if the given position is safe to move
    public static boolean isSafe(int maze[][], int row, int col) {
        if (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1) {
            return true;
        }
        return false;
    }

    // Recursive method to solve the maze
    public static boolean solvemazeUtil(int maze[][], int row, int col, int sol[][]) {
        // Base case: reached the end of the maze
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        // Recursive case
        if (isSafe(maze, row, col)) {
            sol[row][col] = 1; // Mark the current cell as part of the solution path

            // Move down
            if (solvemazeUtil(maze, row + 1, col, sol)) {
                return true;
            }

            // Move right
            else if (solvemazeUtil(maze, row, col + 1, sol)) {
                return true;
            }

            // If both down and right movements are not possible, then backtrack
            else {
                sol[row][col] = 0; // Backtrack: undo the current move
            }
            return false;
        }
        return false;
        
    }

    // Main method
    public static void main(String args[]) {
        int maze[][] = { { 1, 1, 0, 0 },
                         { 0, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

        solvemaze(maze); // Solve and print the maze
    }
}
