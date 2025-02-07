// Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * In this single pointer is used. Take the pointer at right corner, and check if its lesser than target. If its lesser move left of same row
 * else move down of same column.
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n-1;
        while(i<m && j>=0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}