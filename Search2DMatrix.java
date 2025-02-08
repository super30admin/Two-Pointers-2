// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n - 1; // Start with the top-right corner of the matrix

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] < target) {
                i++; // Move down to the next row (because all elements in the current row to the left are smaller)
            } else {
                j--; // Move left to the previous column (because all elements in the current column below are larger)
            }
        }
        return false;
    }
}
