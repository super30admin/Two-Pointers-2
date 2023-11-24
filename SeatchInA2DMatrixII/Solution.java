// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/**
 * In this type of matrix, mark a pointer at top right corner. If that element is not the target, then if that element is greater than target, element won't be present in that
 * column. Decrement the column. If the element is less than target, then the element won't be present in that row. Increment the row.
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = 0, n = matrix[0].length-1;

        while(m < matrix.length && n >= 0) {
            if(matrix[m][n] == target)
                return true;
            else if(matrix[m][n] > target)
                n--;
            else
                m++;
        }

        return false;
    }
}