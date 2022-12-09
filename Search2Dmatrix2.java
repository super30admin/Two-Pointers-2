TC:O(m+n)
Sc:O(1)
//https://leetcode.com/problems/search-a-2d-matrix-ii/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
             if(matrix[i][j] == target) return true;
             else if(matrix[i][j]<target){
                 i++;
             }else{
                 j--;
             }
        }
        return false;
    }
}
