
// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// 1. Two pointer approach by either incrementing row pointer or decrementing column

//240. Search a 2D Matrix II (Medium) - https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        
        int rows = matrix.length, cols = matrix[0].length-1, i = 0, j = cols;
        
        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] < target) i++;
            else j--;
        }
        
        return false;
    }
}