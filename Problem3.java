//time o(mn)
//space o(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0;
        while(i>=0 && i<matrix.length && j >=0 && j<matrix[0].length) {
            int element = matrix[i][j];
            if(target == element) {
                return true;
            } else if(target < element) {
                i--;
            } else {
                j++;
            }
        }
        return false;
        
    }
}
