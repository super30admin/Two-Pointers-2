/**
 * TC : O (m+n) SC: O(1)
 * Approach : Start from top right or bottom left, if target is less than current move to the left column else move down.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols-1;
        while(row < rows && col >= 0){
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] > target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}