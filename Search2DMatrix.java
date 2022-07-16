// Time Complexity: O(M+N), M = number of rows, N = number of columns
// Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n-1;
        while(row < m && col >= 0) {
            if(matrix[row][col] < target)
                row++;
            else if(matrix[row][col] > target)
                col--;
            else
                return true;
        }
        return false;
    }
}
