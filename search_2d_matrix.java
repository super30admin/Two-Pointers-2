// Time - O(m+n)
// Space - O(1)

class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
       int n=matrix[0].length;
       int row =0;
       int col = n-1;
       while(row>=0 && row<m && col>=0 && col<n){
           if(matrix[row][col]==target){
               return true;
           }
           if(matrix[row][col]<target){
               row++;
           }
           else{
               col--;
           }
       }
       return false;


   }
}
