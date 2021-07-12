//TC: O(N*M)
//SC: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0, col = m-1;
        
        while(row < n && col >=0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        
        return false;
    }
}