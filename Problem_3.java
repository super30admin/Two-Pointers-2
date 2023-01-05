// Search a 2D Matrix II
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// either start from bottom left or top right. here will go with top right.
// when current element is smaller than target, go to next row.
// when current element is grater than target, go to previous column.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;

        while(i < m && j >= 0) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
}