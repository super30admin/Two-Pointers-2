// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Top right and bottom left element have either increasing row or column and not both. So start from one of these points and try to go closer to the target by eliminating row and column

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;  int n = matrix[0].length;
        int r = 0; int c=n-1;

        while(r<m && c>=0){
            if(target == matrix[r][c]) return true;
            if(target > matrix[r][c]) r++;
            else c--;
        }

        return false;
    }
}