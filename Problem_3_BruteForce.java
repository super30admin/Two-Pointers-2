// Time complexity - O(n^2)
// Space complexity - O(1)
// Brute force approach using 2 loops and checking each element.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int n = matrix.length; int m = matrix[0].length;
        for(int  i =0; i<n; i++){
            for(int j = 0 ; j< m ; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
