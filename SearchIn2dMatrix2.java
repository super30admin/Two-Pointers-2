// Time complexity:- 
// Space complexity:- 
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach 
/**
 * Approach: 
 * 
 * 
 */ 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = m - 1;
        int j = 0;

        while(i >= 0 && j < n) {
            if(matrix[i][j] == target) {
                return true;
            } else if(target > matrix[i][j]) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }
}

   

     