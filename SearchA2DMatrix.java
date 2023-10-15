/* Time Complexity : O(m+n)
 * 	m - rows of input matrix
 * 	n - cols of input matrix */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int m = matrix.length; //rows
        int n = matrix[0].length; //cols

        //Top-right corner/index
        int i = 0;
        int j = n-1;

        //bottom-left boundary
        while(i < m && j >= 0){
            //If curr val is less than target, move down
            //else move left
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}