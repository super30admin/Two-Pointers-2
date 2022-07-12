// Time Complexity : O(m + n) where m is row length and n is column length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Problem3: https://leetcode.com/problems/search-a-2d-matrix-ii/

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}