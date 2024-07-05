// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
/*
Start from top right. All the elements of the left will be smaller. 
If target is larger then traverse down.
if target is smaller then traverse left
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n-1;
        while (r<m && c>=0) {
            if(matrix[r][c] == target) {
                return true;
            } else if(matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}