class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
           return false;
       }
        int m = matrix.length; //row
        int n = matrix[0].length; //column
        
        int i = 0;
        int j = n - 1;
        
        
        
        
        
         while(i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] < target) {
                i += 1;
            }
            
            else {
                j -=1;
            }        }
        return false;
    }
}
