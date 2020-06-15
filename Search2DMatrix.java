class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      if(matrix == null || matrix.length == 0 ) return false;  
      int m = matrix.length;
      int n = matrix[0].length;
      int r = 0;
      int c = n-1;
      while(c >= 0 && r < m){
          if( matrix[r][c] == target) return true;
        if( matrix[r][c] > target){
            c--;
        }
        else{
            r++;
        }
      }
         return false;
    }
}

/*
TimeComplexity: O(n)
Space Complexity: O(1)
*/