class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null || matrix.length==0){
            return false;
        }
        int m =matrix.length;
        int n = matrix[0].length;
        int row = 0 ;
        int col = n-1;



        while(row<m  &&  col>=0)
        {
            if(matrix[row][col]==target){
                return true;
            }

            else if(matrix[row][col]<target){
                row++;
            }

            else{
                col--;
            }
        }return false;
    }
}
