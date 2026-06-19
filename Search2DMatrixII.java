// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Start from the top-right corner where all values to the left are smaller and all values below are larger.
// If the current value is smaller than the target, move down to find larger values.
// If the current value is larger than the target, move left to find smaller values until the target is found or the search space is exhausted.

class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            }

            if(target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}