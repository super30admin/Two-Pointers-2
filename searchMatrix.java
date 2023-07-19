// Time Complexity : O(m+n), m is rows and n is cols.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * We start from the bottom left corner of the matrix.
 * We compare the value at the current index with the target value.
 * If the value is equal to the target value, we return true.
 * If the value is greater than the target value, we decrement the row index.
 * If the value is less than the target value, we increment the column index.
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int i = rows-1, j = 0;

        while(i>=0 && j<=cols-1){
            int currVal = matrix[i][j];
            if(currVal == target){
                return true;
            }else if(currVal > target){
                i--;
            }else{
                j++;
            }
        }

        return false;
    }
}