// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class SearchMatrix {
     public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;

        int col = 0;
        int row = matrix.length - 1;
        while (col <= matrix[0].length - 1 && row >= 0) {
            if (target == matrix[row][col])
                return true;
            else if (target < matrix[row][col])
                row--;
            else if (target > matrix[row][col])
                col++;
        }
        return false;
    }
}