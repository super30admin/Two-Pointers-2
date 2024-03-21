// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english :
// Starting from the top right corner, if the element is less than target
// - move down, else if its greater than target - move left. This works
// because each row and column in the matrix is sorted in ascending order.

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int n = matrix[0].length - 1;
        int m = 0;

        while (n >= 0 && m <= matrix.length - 1) {
            if (matrix[m][n] == target)
                return true;
            else if (matrix[m][n] > target) { // element less than target
                n--; // move down
            } else {
                m++; // move left if element is greater than target
            }
        }
        return false;
    }
}