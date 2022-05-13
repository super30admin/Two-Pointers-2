
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // start searching our elements from row 0 and last col
        int col = matrix[0].length-1;
        int row = 0;
        // loop through until we don't exceed the matrix boundaries
        while(row < matrix.length && col >=0) {
            // when found, return true
            if(target == matrix[row][col]) return true;
            // first we find the respective col in a row, where element is lesser than the target, as it is a sorted array
            else if(target < matrix[row][col]) col--;
            // start searching in the cols
            else row++;
        }
        // if target not found, return false
        return false;
    }
}