// Time Complexity :O(m+n) as we move only m rows and n cols, so it is m+n
// Space Complexity :O(1),  as no extra space is used
// Did this code successfully run on Leetcode : Yes

public class search2DMatrix2Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length; // Number of Rows
        int n = matrix[0].length; // Number of Cols

        // Starting at the right side top corner of the matrix
        int currentRow = 0;
        int currentCol = n - 1;

        while (currentRow < m && currentCol >= 0) {
            // We'll move 1 step left in the matrix if target element is smaller than
            // element at current position
            if (target < matrix[currentRow][currentCol]) {
                currentCol--;
            }
            // We'll move 1 step down in the matrix if target element is larger than
            // element at current position
            else if (target > matrix[currentRow][currentCol]) {
                currentRow++;
            }
            // If target element is same as the element at current index return true
            else if (target == matrix[currentRow][currentCol]) {
                return true;
            }
        }

        return false;
    }
}
