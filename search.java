//Time Complexity: O(m + n) - You start from the top-right corner and move either left or down at each step, making at most m + n moves.
//Space Complexity: O(1) - No extra space is used — search is done in-place.

//Start from the top-right element of the matrix.
//If the current element is greater than the target, move left; if smaller, move down.
//Continue until the target is found or indices go out of bounds.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int row = 0;
        int col = numCols - 1;

        while (row < numRows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
