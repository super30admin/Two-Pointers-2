// Time Complexity : O(m+n), m and n are length of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * Usig the top right corner approach
 * comparing the current value with target , if the value is greater then move to left (previous colum)
 * if value is smaller move down , to next row.
 * continue till the values don't go out of bound
 */
// Your code here along with comments explaining your approach
public class searchMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

}
