
// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
 /*Approach:
 1) as we know rows and columns are in increasing fashion (sorted individually), we need to start from either the last column first row of last row first colum
 2) once we start we just see if target > current value
 -> just increase the column 
 -> or else just decrement the row as we know we are in correct column if mat[row][col]>target

 
 */


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     
        int row =matrix.length-1;
        int col =0;
        
        
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]<target)
            {
                col++;
            }
            else
            {
                row--;
            }
            
            
        }
        return false;
        
    }
}


