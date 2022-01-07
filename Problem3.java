// Time Complexity : O(r+c)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : y
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r=matrix.length, c=matrix[0].length;
        int i=r-1, j=0, e;
        while(i>=0 && j<c) {
            e = matrix[i][j];
            
            if(e == target) return true;
            if(e > target) i--;
            else j++;
        }
        
        return false;
    }
}
