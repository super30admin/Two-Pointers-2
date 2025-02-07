// Starting from bottom left and increment as we go based on the value

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int i = m - 1;
        int j = 0;

       while (i >= 0 && j < n) {
            //increment row
            // decrement column
           if(matrix[i][j] == target){
            return true;
           }
           else if(target > matrix[i][j]){
            j++;
           }
           else{
            i--;
           }
        }
        return false;
    }
}