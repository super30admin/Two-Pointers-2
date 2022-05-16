/**
Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
**/
class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        
        int row = 0;
        int col = colCount -1;
        
        boolean found = false;
        
        while(row < rowCount && col >=0)
        {
            int pivot = matrix[row][col];
            
            if(pivot == target)
            {
                return true;
            }
            if(pivot > target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        
        return false;
        
    }
}