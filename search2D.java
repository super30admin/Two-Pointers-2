// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//went through increasing cols and decreasing the rows
//untill match
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length - 1;
        int c = 0;
        while (r >= 0 && c < matrix[0].length) {
            if (target == matrix[r][c])
                return true;
            if (target > matrix[r][c])
                c++;
            else
                r--;
        }
        return false;
    }
}