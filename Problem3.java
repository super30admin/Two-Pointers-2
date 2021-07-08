// Time Complexity :O(M+N) where M is length of row and N is length of column
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
        int r=0;
        int c=matrix[0].length-1;
        while(r<matrix.length&&c>=0){
            if(target==matrix[r][c]) return true;
            else if(target<matrix[r][c]) c--;
            else r++;
        }
        return false;

    }
}
