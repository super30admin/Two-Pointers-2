// time complexity: o(m+n)
// space complexity: o(1)


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int row = m-1;
        int column = 0;

        while(row >= 0 && column < n){
            if(target > matrix[row][column]){
                column++;
            }
            else if(target < matrix[row][column]){
                row--;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
