/*
This approach uses a single pointer to search for the target in the 2D matrix. The intuition is
that we start from the top right corner, and check if the target is lesser or greater than the
element at the top right. If it is greater, we move to row below, and if it is lesser we move to
the column to the left and continue checking. We take the top right corner because it is in the 
first row, and using binary search logic we can check the whole matrix from that location, and 
reduce the search space.

Did this run on leetcode: Yes
*/
class Solution {
    //Time Complexity: O(m+n)
    //Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0)
            return false;
        
        int i = 0;
        int j = matrix[0].length - 1;
       
        
        while(i < matrix.length && j >= 0)
        {
             int idx = matrix[i][j];
            
             if(idx == target)
                 return true;
            
            else if(idx > target)
                j--;
            
            else
                i++;
        }
        
        return false;
        
    }
}