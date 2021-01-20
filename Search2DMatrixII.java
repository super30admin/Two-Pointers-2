// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain a pointer at either top-right or bottom-left
//At each iteration, move towards the target
//If matrix[i][j] > target then move column to the left, which is a smaller value
//If matrix[i][j] < target then move row to the row below, which is a higher value element


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0) return false;

        int i = 0;
        int j = matrix[0].length - 1;

        while(i < matrix.length && j >= 0 ) { //boundary conditions

            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }

        }
        return false;
    }
}
