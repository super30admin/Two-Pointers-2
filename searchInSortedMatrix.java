// Time Complexity : O(m + n) where m and n are dimensions of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class searchInSortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        int row = m-1, col = 0;
        while (row >= 0 && col < n) {
            if (target == matrix[row][col]) return true;
            else if (matrix[row][col] > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
}