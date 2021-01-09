// TC: O(m+n) : m,n -> dimensions of matrix
// SC: O(1): no extra space required
// Did it run successfully on Leetcode? : Yes
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length -1 ;
        int c = 0;
        while ( r >= 0 && c < matrix[0].length)
        {
            if ( matrix[r][c] > target)
                r--;
            else if (matrix[r][c] < target)
                c++;
            else
                return true;
        }
        return false;
    }    
}
