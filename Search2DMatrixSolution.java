// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Compare the target with first row last column element in the matrix.
// If target is less move towards right if not move towards down.

public class Search2DMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        
        while(row < m && col >= 0) {
            if(matrix[row][col] < target) {
                row += 1;
            } else if(matrix[row][col] > target) {
                col -= 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
