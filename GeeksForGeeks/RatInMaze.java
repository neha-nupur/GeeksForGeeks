import java.util.*;

public class RatInMaze {
    public static ArrayList < String > findPath(int[][] m, int n) {

        ArrayList < String > res = new ArrayList < String > ();

        findPaths(m, 0, 0, res, "");
        return res;

    }

    // Helper function to check if the current position (x, y) is safe to move
    public static boolean isSafe(int maze[][], int x, int y) {
        // If the current position is outside of the maze or is blocked, return false
        if (x < 0 || x >= maze.length || y < 0 || y >= maze.length || maze[x][y] != 1) {
            return false;
        } else {
            return true;
        }
    }

    // Recursive helper function to find all the valid paths from the current position to the destination
    public static void findPaths(int maze[][], int x, int y, ArrayList < String > res, String path) {
        // If we have reached the destination (bottom-right corner of the maze)
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            // Add the current path to the result list
            res.add(path);
            return;
        }

        // Check if the current position is valid and not already part of the path
        if (isSafe(maze, x, y) == true && maze[x][y] == 1) {
            // Mark the current position as part of the path
            maze[x][y] = -1;

            // Try to move in all possible directions
            if (x + 1 < maze.length) {
                findPaths(maze, x + 1, y, res, path + "D");
            }
            if (x - 1 >= 0) {
                findPaths(maze, x - 1, y, res, path + "U");
            }
            if (y + 1 < maze.length) {
                findPaths(maze, x, y + 1, res, path + "R");
            }
            if (y - 1 >= 0) {
                findPaths(maze, x, y - 1, res, path + "L");
            }

            // Mark the current position as not part of the path
            maze[x][y] = 1;
        }
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}};
        ArrayList < String > res = findPath(maze, maze.length);
        for (String path: res) {
            System.out.println(path);
        }


    }
}