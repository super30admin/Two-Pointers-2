//Time Complexity = O(m*n)
//Space Complexity = O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int p1 = matrix[0].length - 1;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
                if(matrix[i][j] > target){
                    p1--;
                }
                else{
                    p1++;
                }
            }
        }
        return false;
    }
}