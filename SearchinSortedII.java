class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int r = matrix.length-1;
        int c = 0;
        while(r>=0 && c<matrix[0].length){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] > target){
                r--;
            }else{
                c++;
            }
        }
        return false;
    }
}