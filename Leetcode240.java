// TC - O(m*n)
// SC - O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m - 1; // row
        int j = 0; // col
        // Starting from the left bottom most index so that everything towards right is
        // in increasing order and everything upwards is in decreasing order. This will
        // help in eliminating one section while searching.
        while (i < m && j < n && i >= 0 && j >= 0) { // Keep the row and col values within range
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target) { //
                j++;
            } else {
                i--;
            }
        }
        return false;
    }
}