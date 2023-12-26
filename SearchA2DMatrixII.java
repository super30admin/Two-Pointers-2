// Time Complexity : O(rows + cols)
// Space Complexity : O(1)
// Method used : Two pointers

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length, cols = matrix[0].length;

        int i = 0, j = cols - 1;

        while(i < rows && j >= 0)
        {
            if(matrix[i][j] == target) return true;

            else if(matrix[i][j] < target) i += 1;

            else j -= 1;
        }

        return false;
    }
}