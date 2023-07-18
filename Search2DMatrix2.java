// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner of the matrix
        int row = 0;
        int col = cols - 1;

        // Iterate until we reach the bottom-left corner of the matrix
        while (row < rows && col >= 0) {
            // If the current element is equal to the target, return true
            if (matrix[row][col] == target) {
                return true;
            }
            // If the current element is greater than the target, move left in the current row
            else if (matrix[row][col] > target) {
                col--;
            }
            // If the current element is less than the target, move down to the next row
            else {
                row++;
            }
        }

        // If the target is not found, return false
        return false;
    }
}
