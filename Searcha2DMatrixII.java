// Time Complexity: O(m+n)
// Space Complexity: O(1)

/*
 * travese though the array from the top right corner. move left 
 * if the value is higher than the target and down if the value
 * is lower than the target.
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int i = 0;
        int j = matrix[0].length-1;
        while(i < matrix.length && j >= 0){
            while(i < matrix.length && j >= 0 && matrix[i][j] > target){
                j--;
            }
            while(i < matrix.length && j >= 0 && matrix[i][j] < target){
                i++;
            }
            if(i < matrix.length && j >= 0 && matrix[i][j] == target) return true;
        }
        return false;
    }
}