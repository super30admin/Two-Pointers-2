// Time Complexity : O(m+n) m - number of rows; n - numner of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
	1. Start at Top-Right corner
    2. if target < matrix element 
            move right
        else
            move down
	3. if matrix element = target, return true. If not found, return false
*/

// Your code here along with comments explaining your approach

public class SearchInA2dMatrix2 {

	public boolean searchMatrix(int[][] matrix, int target) {
        
        //edge
        if(matrix == null || matrix.length == 0)
            return false;
        
        //Bounds
        int m = matrix.length, n = matrix[0].length;
        
        //Starting at top-right corner
        int row = 0, col = n-1;
        
        //Conditions of while is based on the starting point
        while(row < m && col >= 0) {
            //Found the target
            if(target == matrix[row][col])
                return true;
            
            //Go left for smaller numbers
            else if(target < matrix[row][col])
                col--;
            
            //Go down for larger numbers
            else if(target > matrix[row][col])
                row++;
        }
}