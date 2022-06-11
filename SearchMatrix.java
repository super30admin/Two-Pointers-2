// Time Complexity : O(N + M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        int i = 0, j = n - 1;

        while (i < m && j >= 0) {

            int num = matrix[i][j];

            if (num == target) return true;
            else if (num < target) i++;
            else j--;
        }

        return false;

    }
}