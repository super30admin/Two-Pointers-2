// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - Since the array is sorted from top to bottom and left to right, I reduce search space by finding the right column first -> I start from first row, last column and if the current column is already greater than target, it will always be greater, so I move to the left. Once I am on a column in which the value is <= target, I am at the right place and keep going down on the row to find the correct index. If again the column value becomes too large, I shift to the left and keep doing it until I find the index or go out of bounds.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }
}