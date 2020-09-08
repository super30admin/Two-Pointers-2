
// Time Complexity : O(m + n) m = columns and n = rows, we check for the target and go through either one row or one column
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// As we know that the rows and columns are in ascending order.
// We move towards the row and column keeping track of the pointers and trace the target element.

// Your code here along with comments explaining your approach

class SearchInMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] > target)
                col--;
            else
                row++;
        }

        return false;
    }
}