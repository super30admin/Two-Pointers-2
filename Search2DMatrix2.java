
// Time Complexity : O(m + n) [m = matrix.length; n = matrix[0].length]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * Since arrray's row and index is sorted I can start searching from right top corner or left bottom corner
 * since In my case I start from right top corner pos, the elements to left  in the same column swill be smaller 
 * and elements below in the same column will be bigger
 * I will compare with my target and choose the path where the element can lie and discard the remaining  
 */

// Your code here along with comments explaining your approach


class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (true) {
            if (matrix[row][col] == target) {
                return true;
            } else if (target > matrix[row][col]) {
                row += 1;
                if (row >= m) {
                    return false;
                }
            } else if (target < matrix[row][col]) {
                col += -1;
                if (col < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}