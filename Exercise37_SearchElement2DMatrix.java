//Time Complexity: O(m+n)
//Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //base case
        //no elements present
        if(matrix == null || matrix.length==0){             
            return false;
        }
        
        //let low = bottom left element && col = 1st column
        int row = matrix.length-1, col = 0; 
                           
        while (row >= 0 && col < matrix[0].length) 
        {
            if (matrix[row][col] > target) 
            {
                row--;                  // move towards the top
            } 
            else if (matrix[row][col] < target) 
            {
                col++;                  //move towards the right
            } else 
            { 
                return true;            //present
            }
        }

        return false;
    }
}