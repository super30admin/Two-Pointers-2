class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n= matrix[0].length;
        //traversing through top-right corner
        int i=0; int j=n-1;
        while(i<m && j>=0){

            if(matrix[i][j]==target) return true;
            //traverse to left columns
            else if(matrix[i][j]>target){
                j--;
            }
            else{
            //traverse down rows
                i++;
            }
        }
        return false;
    }
}