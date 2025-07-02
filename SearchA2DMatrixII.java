// Time Complexity: O(m + n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach:
// Start from the top-right corner of the matrix
// Compare the current value with the target, If the value equals the target, return true
// If the value is greater than the target, move left (values decrease to the left)
// If the value is less than the target, move down (values increase downward)
// Repeat this process until the target is found or indices go out of bounds
// If out of bounds without finding the target, return false
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >=0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                // Move left
                col--;
            }else{
                // Move down
                row++;
            }
        }

        return false;
    }
}