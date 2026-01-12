// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed to start from correct corner.


// Your code here along with comments explaining your approach in three sentences only
// I start from the top-right corner because from there I can eliminate one full row or column each step.
// If the current value is bigger than target, I move left, and if smaller, I move down.
// This way I never revisit cells and finish in O(m+n).

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = n - 1;

        while (r < m && c >= 0) {

            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) c--;
            else r++;
        }

        return false;
    }
}
