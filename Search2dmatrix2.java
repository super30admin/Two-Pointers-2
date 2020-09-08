// Time Complexity :O(m+n) because we have to go either left or down.
// Space Complexity : O(1) no extra space is required.
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//  we know that both row and column are in increasing order.so we start from top right corner.
// if the target is bigger go in that column down. if smaller then skip the entire column and go right
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0)
            return false;

        int num_row = matrix.length, num_col = matrix[0].length;

        // we start from right corner becuase we can go in only one direction which
        // reduces search space
        int j = num_col - 1, i = 0;

        // boundary condition is either last row and top column
        while (i < num_row && j >= 0) {
            // we either go down or left accordingly
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target)
                i++;
            else
                return true;
        }
        return false;

    }
}