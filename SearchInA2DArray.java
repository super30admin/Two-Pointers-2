// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// 1: We start from an element from which we can make a clear decision, either the last element in the first row or the last element in the first column
// 2: If the target is greater, we move our pointer downwards, else if it is smaller, we move our pointer to the left
// 3: Ultimately, if we are not able to find the target within our search constraints, we return false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = n-1;

        while(r < m && c >= 0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }
}