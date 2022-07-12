// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        // starting from the top right of the matrix
        int row = 0;
        int column = n - 1;

        while (row < m && column >= 0) {
            if (target > matrix[row][column]) {
                row++;
            } else if (target < matrix[row][column]) {
                column--;
            } else {
                return true;
            }
        }

        return false;

    }
}