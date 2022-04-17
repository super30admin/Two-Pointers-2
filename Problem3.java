public class Problem3 {
    //Time Complexity O(n)
    // Space Complexity O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int i = m;
        int j = 0;

        //lower left
        while (i >= 0 && j <= n) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                i--;
            } else {
                j++;
            }

        }
        return false;
    }
}
