// Time: O(m+n)
// Space: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (matrix == null || matrix.length == 0)
            return false;
        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {

            if (matrix[i][j] == target)
                return true;

            if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }

        }
        return false;
    }
}
