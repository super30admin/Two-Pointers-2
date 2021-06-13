
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// We start with top right corner of the matrix (as it will clearly give us direction to traverse based on if target is less than current value)
// If current is less than target we go left
// If current is greater than target we go down
class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            int curr = matrix[row][col];
            if (curr == target) {
                return true;
            } else if (curr < target) {
                // go left
                row++;
            } else {
                // go down
                col--;
            }
        }

        return false;
    }
}
