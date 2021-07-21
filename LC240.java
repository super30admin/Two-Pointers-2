class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = matrix.length - 1;
        int j = 0;
      
         while(i >= 0 && j < matrix[0].length) {
                if(matrix[i][j] == target) {
                    return true;
                } else if(matrix[i][j] < target) {
                    j++;
                } else {
                    i--;
                }
            }            
        
        return false;
        
    }
}

//Time : O(n+m)
//Space : O(1)