
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
         int row=0, col =n-1;

         while(row<m && col>=0)  // worst case row can go to m and n can go to 0 (which is  cols)
         {
             if (matrix[row][col]> target)
                 col--;
             else if(matrix[row][col]< target)
             {
                 row++;
             }
            else{
                return true;
            }

         }
   return false;
    }
}