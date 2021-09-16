

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null)
            return false;
        int col=matrix[0].length-1,row=0;
        while(col>=0 && row<matrix.length){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}