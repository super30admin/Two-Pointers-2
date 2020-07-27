/*
// Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    strt from bottom left or top right corner, because they are the
    only one, where we can make a decision to see if target is
    lower or larger than cur val.
    at bottom left we only move up or right, because.
    we know on every step, that any thing below or left of cur is not
    target.
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int i = matrix.length -1;
        int j = 0;
        while(i >= 0 && j >= 0 &&
              i < matrix.length && j < matrix[0].length){
            if(matrix[i][j] == target)
                return true;

            if(matrix[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }
}
