class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // Time : O(n)
        // Space : O(1)

    // in first row: if value is less than the  last columns value then decrease the column... repeat the process untill you hit value greater then column value
    // as soon as you hit that column with value more than col value in 1st row increase the row and repeat the process again.
    
        if(matrix == null || matrix.length ==0){
            return false;
        }
        
        int row = 0;
        int col = matrix[0].length-1;
        
        
        while(row < matrix.length && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else if(matrix[row][col] < target){
                row++;
            }
        }
       return false; 
        
    }
}