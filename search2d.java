

# Time Complexity : O(n+m) //searching in both rows and cols
# Space Complexity : O(1)




class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1; // top right corner
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) { // moving left 
                col--;
            } else if(target > matrix[row][col]) { // moving down eliminating the row since value is gretaer than the largest value in that row
                row++;
            }
        }
        return false;
    }
}