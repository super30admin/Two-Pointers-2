// Time Complexity : O(M+N) where M is rows,N is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// start from top right or bottom left, move ptrs accordingly.

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]<target){
                r++;
            }else if(matrix[r][c]>target){
                c--;
            }
        }

        return false;
    }
}
