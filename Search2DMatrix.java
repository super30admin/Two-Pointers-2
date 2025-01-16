// In this we are starting from upper right element(eg. 15 in our matrix), then comparing target with this current element, if equal, 
// return true, else check if target < curr, we know that elements to left are having smaller values, so move left(i.e. decrement col),
// else if target > curr, we know that elements to the down are increasing, so move down(i.e. increment row). Do this till target found 
// or row < m && col>=0.

// Time Complexity : O(m+n) ==> m is number of rows and n is number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Checking for base case
        if (matrix.length == 0 || matrix == null) {
            return false;
        }
        // Declare m and n
        int m = matrix.length;
        int n = matrix[0].length;
        // Declare row and col to start from the upper right element
        int row = 0;
        int col = n - 1;
        // Run a loop till row<m && col>=0 or target found
        while (row < m && col >= 0) {
            // Upper right element
            int start = matrix[row][col];
            // Compare current with target
            if (start == target) {
                // If matches, return true
                return true;
            }
            // Else if target<start, move left
            else if (target < start) {
                col--;
            }
            // Else if target>start, move down
            else {
                row++;
            }
        }
        // If the true statement inside the while loop is not executed and we came out
        // of the loop, that means target not found, return false
        return false;
    }
}