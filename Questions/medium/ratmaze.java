public class ratmaze {
    static boolean isSafe(int[][] maze, int x, int y, int n, boolean[][] visited) {
        return (x >= 0 && x < n && y >= 0 && y < n &&
                maze[x][y] == 1 && !visited[x][y]);
    }

    static void solveMaze(int[][] maze, int x, int y, int n, String path, boolean[][] visited) {
        if (x == n - 1 && y == n - 1) {
            System.out.println(path);
            return;
        }

        visited[x][y] = true;

        // Move Down
        if (isSafe(maze, x + 1, y, n, visited)) {
            solveMaze(maze, x + 1, y, n, path + "D", visited);
        }

        // Move Right
        if (isSafe(maze, x, y + 1, n, visited)) {
            solveMaze(maze, x, y + 1, n, path + "R", visited);
        }

        // Move Up
        if (isSafe(maze, x - 1, y, n, visited)) {
            solveMaze(maze, x - 1, y, n, path + "U", visited);
        }

        // Move Left
        if (isSafe(maze, x, y - 1, n, visited)) {
            solveMaze(maze, x, y - 1, n, path + "L", visited);
        }

        // Backtrack: Unmark current cell
        visited[x][y] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        System.out.println("All possible paths:");
        solveMaze(maze, 0, 0, n, "", visited);
    }
}
