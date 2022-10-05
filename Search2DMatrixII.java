// Time Complexity :O(m + n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        
        int c = matrix[0].length - 1;
        int r = 0;
        
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] < target)
                r++;
            else if(matrix[r][c] > target)
                c--;
            else
                return true;
        }
        return false;
    }
}
