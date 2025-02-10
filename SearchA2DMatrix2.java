class Solution {
    // Time Complexity: O(m + n) 
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        // If the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1; 

        while (row < matrix.length && column >= 0) {
            int current = matrix[row][column];
            if (current == target) {
                return true;
            } else if (current > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}