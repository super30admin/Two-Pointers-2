//Time Complexity- O(m+n)
//Space Complexity- O(1)
//Successfully ran on leetcode


class Solution {
 public boolean searchMatrix(int[][] matrix, int target) {
     
     if(matrix== null || matrix.length==0) return false;
     
     int m = matrix.length;
     int n= matrix[0].length;
     
     //TOP RIGHT
     
     int r=0;
     int c= n-1;
     
     while(r < m && c >= 0){
     
     if(target < matrix[r][c])
     {
         c--;
     }
     else if(target > matrix[r][c]) {
         r++;
     }
     else return true;
     
 }
     return false;
}
}