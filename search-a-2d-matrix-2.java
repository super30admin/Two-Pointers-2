
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*1. Start from the top-right corner.
*       if target == element, return true
*  2. If  target < element, move left 
* 
*  3. If target > element, move down */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n-1;
        while(i < m && j >= 0)
        {   
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target) i++;
            else j--;
        }

        return false;
    }
}