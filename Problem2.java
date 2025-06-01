
// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english : Search Space Reduction

class Problem2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] > target) col--;
            else if (matrix[row][col] < target) row++;
            else return true;
        }

        return false;
    }
}