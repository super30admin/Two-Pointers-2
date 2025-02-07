
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
Starting from bottom left
compare target to current elemnet to reduce search space
until target is found else return false
 */

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int row=m-1;
        int col=0;

        while(row>=0 && col<n){
            if(matrix[row][col]==target)
                return true;
            if(target>matrix[row][col]){
                col++;
            }
            else {
                row--;
            }
        }

        return false;
    }
}