class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Initializing my pointer to first row's last column
        // if the value at the pointer greater than target then increment row
        // if it is less than target then decrement column
        // else if the element is found return true
        int r = 0;
        int c = column - 1;

        while (r < row && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }

        // If elemt is not found in the matrix return false
        return false;
    }
}

// Time Complexity : O(m*n);
// Space Complexity: O(1)