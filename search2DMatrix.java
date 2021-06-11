
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
1. Since the elements are sorted its best to start from top right corner i.e. max value of c lowest value for r
2. If the value is lesser than target then go left
3. If the value is lesser than target then go down

*/

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;
        int m = matrix.length;
        while(r<m && c>=0) {
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }
}
