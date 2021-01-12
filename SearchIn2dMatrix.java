/**
Leetcode: https://leetcode.com/problems/search-a-2d-matrix-ii/
Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Collabedit: http://collabedit.com/3a7kv

**/

class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int row = 0;
        
        int col = matrix[0].length -1;
        
        
        while(row < matrix.length && col>=0)
        {
            
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                col--;
            else
                row++;
        }
        
        return false;
        
    }
}