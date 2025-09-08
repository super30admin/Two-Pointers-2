// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
I can either start from top right or bottom left because I can be definitive where to go
    top-right
    if mat[curr] > target then go left
    else go down
    bottom-left
    if mat[curr] > target then go right
    else go up
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        // start from top right corner
        int r = 0;
        int c = n;
        while(r <= m && c >= 0){
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}
