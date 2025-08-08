// THis approach uses two pointers starting from top right index. If a number is found we return true and if the target is greater than the number we increment row and if it is lesser we decrement the column. We keep doing this until its found
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j=matrix[0].length-1;
        while(i<matrix.length && j>=0) {
            if(matrix[i][j]==target) return true;
            if(target>matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
