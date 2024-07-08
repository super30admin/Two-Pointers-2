// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m  = matrix.length;
        int n = matrix[0].length;'
        int row = 0;
        int col = n - 1;

        while (i < m && j >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            }else{
                col--;
            }
        }

        return false;
    }
}