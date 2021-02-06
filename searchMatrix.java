// Time Complexity : O(m+n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
// First, we initialize a (row, col)(row,col) pointer to the top-right of the matrix. 
// Then, until we find target, we do the following: 
// if the currently-pointed-to value is larger than target we can move one row "down". Otherwise, if the currently-pointed-to value is smaller than target, we can move one column "left".
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
