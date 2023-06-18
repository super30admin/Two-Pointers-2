// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: No issues

// Your code here along with comments explaining your approach:
// we start at the top right index. we compare it with the target .
// if it is less than the target we need to move to next row as all the elements it that row are smaller than that element
// else we need to move 1 col towards left.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        int i=0; int j=matrix[0].length -1;
        while(i< matrix.length && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target)
                i++;
            else {
                j--;
            }
        }
        return false;
    }
}