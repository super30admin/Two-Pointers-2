class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=matrix[0].length-1;
        int j=0;
        while( i>=0 && j< matrix.length){
            if(matrix[j][i] == target) return true;
            else if(matrix[j][i]> target) i--;
            else if(matrix[j][i]< target) j++;
            else return false;
            
        }
        return false;
    }
}