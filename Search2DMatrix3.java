// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* 
 * Start from the top right or bottom left corner as at every point we can have
 * 3 conditions - either the elememt is the target or its lesser than the target or greater
 * than the target.
 * So to get 2 unique decision/direction for movement at every point,
 * this top right/bottom left position have one greater and one lesser element as its neighbour
 */
// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0; int j = n-1;
        while(i<=m-1 && j>=0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}