// Time Complexity : O(n + m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use search space reduction here to decrease out time complexity. We start from upper right corner of matrix. If target is
   less than matrix[i][j] we move to previous column j-- else we move to next row i++. In this way each time we are eliminating
   our search space and decreasing it. In the end we return whether we found the element or not.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0, j = m - 1;

        while(i < n && j >= 0) {
            if(matrix[i][j] == target)
                return true;
            
            if(target < matrix[i][j]) 
                j--;
            else    
                i++;
        }
        return false;
    }
}