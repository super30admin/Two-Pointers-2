class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null)
            return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        //Col search
        int r = 0;
        int c =cols-1;
        while(r <rows && c >= 0) {
            
        if(matrix[r][c] == target)
                return true;

       else if(matrix[r][c] > target) {
            c--;
        }
        else if (matrix[r][c] < target) {
            r++;
        }
        
    }
        return false;
        
}
}
