/*
 * Time Complexity : O(m*n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - We start from either the right top corner or the left bottom corner. We check if the target element is lesser than the current value. 
 * If yes, then we move to the left(j--) or if greater we move down(i++) until we find our target.
 */

//https://leetcode.com/problems/search-a-2d-matrix-ii/description/
class FindTargetIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target<matrix[i][j]){
                j--;
            }else if(target==matrix[i][j]){
                return true;
            }else{
                i++;
            }
        }
        return false;
    }
}