// Time Complexity :O(N*M) n are the number of rows and M is the no of columns in the given matrix.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach:
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int col=0;
        int row=matrix.length-1;
       while(row>=0&&col<matrix[0].length){
           if(matrix[row][col]==target)
               return true;
           else if(matrix[row][col]>target)
               row--;
           else
               col++;
       }
        return false;
    }
}