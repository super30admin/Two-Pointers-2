//Time complexity = O(M*N)
//Space complexity = O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int j = n-1;
        int i = 0;
        while( j >=0 && i <= m-1){
            if( matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}