class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        if(matrix == null || matrix.length == 0)
            return false;
        
        
        int m = matrix.length;
        int n = matrix[0].length-1;
         
            int row  = 0;   
            
            while(row < m && n>=0){
            if(matrix[row][n] == target){
                return true;
            }else if(target > matrix[row][n]){
                row++;
            }else{
                n--;
            }
            }
            
            
        return false;
        
        
        
    }
}