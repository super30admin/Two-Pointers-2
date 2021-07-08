
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*We start search the matrix from top right corner, initialize the current position to top right corner,
if the target is greater than the value in current position, then the target can not be in entire row of current position because the row is sorted,
if the target is less than the value in current position, then the target can not in the entire column because the column is sorted too.
We can rule out one row or one column each time, so the time complexity is O(m+n). */
 */

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while (col >= 0 && row <= matrix.length - 1) {

            if (target == matrix[row][col]) {
                return true;  //found target
            } else if (target < matrix[row][col]) {
                col--;  //not presnt in current col so decrease the col length
            } else if (target > matrix[row][col]) {
                row++; //not present in current row, so increase the row length
            }
        }
        return false;
    }
}