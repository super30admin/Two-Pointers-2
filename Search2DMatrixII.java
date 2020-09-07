// Time Complexity : O(M+N) where N is the number of rows and M is number of columns.
// Space Complexity : O(1) as we are using just two pointers.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :
        //Just keep two pointers, one will keep track of the column
        //starting from the last one and other will keep track of row
        //starting from the first one going the boundary of elements
        //where our target can possibly lie.

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int i = 0;
        int j = m - 1;
        
        while(i < n && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
