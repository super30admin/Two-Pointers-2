// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = m - 1, col = 0;//bottom-left
        while(row>=0 && col<n){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) row--;
            else col++;
        }
        return false;
    }
}