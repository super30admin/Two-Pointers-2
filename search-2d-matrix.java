//time complexity is O(m)
//space complexity is O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }

            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        return false;

    }
}