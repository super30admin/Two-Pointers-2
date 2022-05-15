class Solution {
    /**
     * Start from top right as we have defined single path to move in either directions.
     * TC: O(m + n)
     * Space: O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}