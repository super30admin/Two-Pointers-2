// Time Complexity : O(m*n)), 
// Space Complexity : O(1),
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package twoPointer2;

public class MatrixSearch {
   public boolean searchMatrix(int[][] matrix, int target) {
        //check empty
        if(matrix.length == 0 || matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        int i = m - 1, j = 0;
        while(i >= 0 && j < n){
            if(matrix[i][j] == target) return true;                          
            else if(matrix[i][j] < target) j++;
            else i--;
        }
        return false;
    }   
}
