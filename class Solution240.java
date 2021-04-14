class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix==null){
            return false;
        }
        int m=matrix.length, n=matrix[0].length;
        int i=0,j=n-1;
        while(i<m && j >=0)   {
            if(matrix[i][j]==target){
                return true;
            }
            else if(target>matrix[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
        
    }
}