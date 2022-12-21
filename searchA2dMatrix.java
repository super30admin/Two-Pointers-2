
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * Iteratively moves towards the target based 
 * on target less than element, move up and if greater, move right. 
 */

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //null
        if(matrix==null) return false;
        int m=matrix.length,n=matrix[0].length;
        if(target<matrix[0][0] || target>matrix[m-1][n-1]) return false;
        int i=m-1,j=0;
        while(i>=0 && j<n){
            if(target==matrix[i][j]) return true;
            else if(target<matrix[i][j]) i--;
            else j++;
        }
        return false;
    }
}
