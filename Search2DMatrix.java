
// Time Complexity : O(m+n) m-rows and n-coln of the gvn matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**
 * Approach 1: Brute Force - Since each row is sorted and column aswell -can use binary search over the entire matrix(logmlogn)
 *          2: Use binary search on each row(mlogn)
 *          3: Start from top right or bottom left and check if the target is lesser or greater and move accordingly(m+n)
 *
 *  Here, we are using Approach 3- starting from bottom left(where the elements above the same column are lesser than the curr and across the same row-values increase)
 *  Using that, chk if target is lesser than current val then move up along the same column by 1 and check again
 *                  if target is greater than current val then move across the same row by 1 and check again
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int i=matrix.length-1,j = 0;

        while(i>=0 && j<matrix[0].length){
            if(target == matrix[i][j]) return true;
            else if(target < matrix[i][j]){
                i--;
            }else
                j++;
        }
        return false;
    }
}