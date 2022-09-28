class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // T.C : O(m + n)
        // S.C : o(1)
        // Executed successfully
        if (matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        // starting from last row and first column
        int r = m - 1, c = 0;
        
        while (r >= 0 && c < n) {
            if (matrix[r][c] < target) {
                c++;
            }
            else if (matrix[r][c] > target) {
                r--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

// solution-2

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        // starting from first row and last column
        int row = 0, column = n-1;
        
        while(row < m && column >= 0) {
            if(matrix[row][column] < target) {
                row++;
            }
            else if (matrix[row][column] > target) {
                column--;
            }
            else {
                return true;
            }
        }
        return false;
    }
}