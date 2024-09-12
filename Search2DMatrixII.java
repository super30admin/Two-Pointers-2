// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/1053472106/
// Three line explanation of solution in plain english
/*
 * Start from either top-right corner of the matrix or, bottom-left corner of the matrix
 * If the target is greater than the current element, you've to traverse down the row, else traverse down the column
 * Search till the boundary conditions are met
 */
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int row =0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target)
                return true;
            else if( target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}