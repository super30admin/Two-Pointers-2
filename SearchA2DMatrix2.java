// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
/*
Have a pointer pointing to the (m-1,0) cell or (0,n-1) because it helps us in identifying if we are greater
or less than target and move the row or column accordingly since as per the problem, rows and columns
are sorted in ascending order. Need to make sure we are not crossing the boundaries for both row and
column.
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m - 1, c = 0;
        while(r >= 0 && c < n) {
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] > target)
                r--;
            else
                c++;
        }
        return false;
    }
}