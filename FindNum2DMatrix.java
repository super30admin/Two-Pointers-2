//Time Complexity:O(M+N); M is no. of row , N is no of column
//Space Complexity: O(1);
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length-1 ,col=0;
        while(row>=0 && col<=matrix[0].length-1){
            if(target<matrix[row][col]){
                row--;
            }else if (target>matrix[row][col]){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }
}