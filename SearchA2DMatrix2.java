// Time complexity O(m+n) where m and n are the number of rows and columns respectively
// Space complexity O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0 , column = matrix[0].length-1;
         
        
        while(column>=0 && row<matrix.length )
        {
            if(matrix[row][column]<target)
            {
                row++;
            }
            
            else if(matrix[row][column]==target)
                return true;
            else if(matrix[row][column]>target)
                 column--;
            
        }
        return false;
    }
}