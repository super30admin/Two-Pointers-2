class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length, n= matrix[0].length;
        //top right corner
        int r=0, c=n-1;
        while(r <= m-1 && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
//time - O(M+N)
//space - O(1)