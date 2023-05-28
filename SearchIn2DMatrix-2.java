//tc=O(m+n)
//sc=O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int row = m - 1;
        int col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) {
                return true;
            }
            else if (target > matrix[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }
        return false;
    }
}