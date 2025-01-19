// Time Complexity : O (m + n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes

/*
 * Start from top right (or bottom left). Move either down or left.
 * If element < target, move down. If element > target, move left.
 * Continue this until target is found, or we go out of bounds.
 */
public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // start from top right
        int i = 0;
        int j = n - 1;

        while(j >= 0 && i < m) {
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target) i++; // move down
            else j--; // move left
        }
        return false;
    }
}