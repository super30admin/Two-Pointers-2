public class SearchMatrix {
    // TC O(n+m) - row can only be decremented mm times and col can only be
    // incremented nn times before causing the while loop to terminate, the loop
    // cannot run for more than n+mn+m iterations
    // SC O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length - 1;
        int i = 0, j = n;
        while (i < m && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
