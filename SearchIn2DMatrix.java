class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while(j >= 0 && i < matrix.length) {
            if(matrix[i][j] == target) {
                return true;
            }
            if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}