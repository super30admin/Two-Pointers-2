
// Time Complexity :o(m+n) where m is the number of rows and n is the number of columns in the matrix
// Space Complexity :O(1) as we are using constant space
// Did this code successfully run on Leetcode :yES
// Three line explanation of solution in plain english
// We start from the top right corner of the matrix and compare the current element with the target. 
// If they are equal, we return true. If the current element is greater than the target, we move left (decrease column index).
//  If the current element is less than the target, we move down (increase row index). We continue this process until we find the target or go out of bounds of the matrix.
//We can also start from the bottom left corner and follow the same logic, but starting from the top right corner is more intuitive for this problem.

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }

        return false;
    }
}