public class problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {

// Time Complexity : O(m+n) -> m and n are elements in matrix by rows and coloumns.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
        if(matrix == null || matrix.length == 0 || target == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n - 1;
        
        while(r < m && c >= 0){
            if(matrix[r][c] < target){
                r++;
            }else if(matrix[r][c] > target){
                c--;
            }else{
                return true;
            }
        }
        
        return false;
    }
}
