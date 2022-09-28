// TC : O(m+n)
// SC : O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int column = n - 1;
        
        while(row < m && column >= 0) {
            if(matrix[row][column] == target)
                return true;
            else if(matrix[row][column] > target)
                column--;
            else
                row++;
        }
        return false;
    }
}
