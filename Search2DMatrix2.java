// TC - O(m+n), SC - O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // We can either place our pointer at right top corner or bottom left corner as in these both places, one way is smaller and other way is larger than the current value
        int m = matrix.length;
        int n = matrix[0].length;
        // Placing pointer at top right corner
        int r = 0, c = n-1;
        
        // Iterate till r < rows.length and c is greater than or equal to 0, which is 1st column in the matrix, if current r, c value at matrix is equal to target, return true, else greater than target, decrement c else increment r
        while(r < m && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        
        // return false, if the loop breaks, as there is no target present in matrix
        return false;
    }
}