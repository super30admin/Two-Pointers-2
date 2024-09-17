// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : No
class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix==null){
            return false;
        }
        int row  = matrix.length-1;
        int col = 0;
        while(col<=matrix[0].length-1 && row >= 0){
            if (matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]>target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}
