// Time Complexity : O(m + n) where m and n is row and col of matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// creating a top right pointer to base comparisons on
// if target greater than pointer, it must be in next row since sorted
// if target less than pointer, it must be in previous column since sorted

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n-1;
        
        while(row < m && col >= 0) {
            
            if(matrix[row][col] < target) {
                row++;
            }
            
            else if(matrix[row][col] > target) {
                col--;
            }
            
            else {
                return true;
            }
        }
        return false;
    }
}
