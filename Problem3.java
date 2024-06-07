/*
    LC - 240. Search a 2D Matrix II
    TC - O(m + n)
    SC - O(1)
    Approach - Using one pointer, keeping it in either top right (or) bottom left.
        consider at top right -
        if the target is equal, return true
        if the target is greater, move the pointer to bottom (row++) else left(col--)
        return false
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0, col = n-1;

        while (row < m && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
}