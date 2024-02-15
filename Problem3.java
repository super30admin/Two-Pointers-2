// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**
 * We have multiple approaches to solve this problem but the most optimized onw
 * would be when we don't cover all the elements. To do so, we will start from either
 * top-right or bottom-left element. If we start from top-right, we will increment
 * row if target is greater else decrement the column. Vice-versa when we start from
 * bottom-left.
 */


public class Problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        //start form top-right
        int row = 0;
        int col = n-1;

        while(row<m && col>=0) {
            if(matrix[row][col] == target) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        return false;

    }

    public boolean searchMatrixBottomLeft(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        //start from bottom-left
        int row = m-1;
        int col = 0;

        while(row>=0 && col<n) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }

        return false;

    }
}
