// Time Complexity: O(n + m)
// Space Complexity: O(1)

// We use a two pointer approach starting at the top right corner element. If target is larger than our current element, we look below. If it is smaller we look to the left, else we have found the element

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (target > matrix[row][col]) row++;
            else col--;
        }
        return false;
    }
}
