class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = 0;
        while(m>=0 && n<=matrix[0].length-1){
            
            if(matrix[m][n]<=target){
                if(matrix[m][n]>=target){
                    if(matrix[m][n]==target) return true;
                }else{
                    n++;
                }
            }else{
                m--;
            }
        }
        return false;
    }
}