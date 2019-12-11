/**
LeetCode Submitted : True
Space Complexity : O(1)
Time Complexity : O(N)

The idea is to check from array[lst row][0] and see if the value is greater than or less than target. If greater than 
decrease row by 1. Else iterate that row. Alternate approach will be to do spiral matrix traversal and change pointers accordingly. 

**/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int bottom_row = matrix.length - 1;
        int bottom_col = 0;
        
        if(matrix == null || matrix.length < 1)
            return false;
        
        
        //check now for all elements
        while(bottom_row >= 0 && bottom_col < matrix[0].length){
            if(matrix[bottom_row][bottom_col] == target)
                return true;
            else if(matrix[bottom_row][bottom_col] > target){
                bottom_row --;
            }else{
                bottom_col++;
            }
            
        }
        
        return false;
    }
}
