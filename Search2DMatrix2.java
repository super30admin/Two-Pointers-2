class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int l=matrix[0].length;
        int i=0;
        int j=l-1;
        while(i<m && j>=0l){
            if(matrix[i][j]> target){
                j--;
            }
            else if(matrix[i][j]< target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}