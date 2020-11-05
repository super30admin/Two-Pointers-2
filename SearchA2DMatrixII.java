package Nov4;

class SearchA2DMatrixII {
	
    public boolean searchMatrix(int[][] matrix, int target) {
        
/* 
	Time Complexity: O(m+n) where m and n are rows and columns of matrix array.
	Because in worst case, we will iterate through whole row and whole column from right top corner to left bottom corner. 

	Space Complexity: O(1)
	No extra space used, so O(1).
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
    Iterate from right top corner. 
    Compare current matrix element with target.
            If equal, return true
            If target > matrix elem, increment row for the current column itself.
            If target < matrix elem, increment column for the current row itself.
 
*/
        
        // edge
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int i = 0, j = cols-1;
        
        while (i < rows && j >= 0) {
            
            if (matrix[i][j] == target) {
                return true;
            } 
            else if (matrix[i][j] > target) {
                j--;
            } 
            else {
                i++;
            }
        }
        
        return false;
    }
}