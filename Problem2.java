// Leetcode 240 - Search in a 2d matrix 2
// Time - O(m + n)
//  Space - O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int col = matrix[0].length - 1;
        
        
        while(row <= matrix.length-1  && col >= 0)
        {
            if(target > matrix[row][col]){
                
                row++;
            }else if(target < matrix[row][col]){
                
                col--;
            }else{
                
                return true;
            }
        }
        
        return false;
        
    }
}