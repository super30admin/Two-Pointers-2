// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Since the rows and columns are sorted, move a column left if the target is less than current number and move a row below if the target is larger than the current number. We can start from either the top right or the bottom left of the matrix.

public class SearchIn2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix == null || matrix.length == 0) return false;
        
        int i = 0;
        int j = matrix[0].length - 1;
        
        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length ){
            if( target == matrix[i][j] ){
                return true;
            } else if( target < matrix[i][j] ){
                j = j - 1;
            } else {
                i = i + 1;
            }
        }
        
        return false;
    }
}
