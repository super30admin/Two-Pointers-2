// Time Complexity : O(m+n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach :  We start looping from [0][n-1] or [m-1][0] as from these points we see a pattern of increasing on one direction and decreasing
// on another direction. So I picked [0][n-1], compared it with target and moved the pointer lo left if target is greater or moved the
// pointer down if target is lower.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(i<m && j>=0){ // boundary conditions
            if(matrix[i][j] == target){
                return true;
            } else if(target > matrix[i][j]){
                i++; // move towards bottom in 2d matrix visualization
            } else{
                j--;// move towards left in 2d matrix visualization
            }
        }
        return false;
    }
}