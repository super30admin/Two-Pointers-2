//Approach: Using the pointer approach. Can put pointer either at top right or bottom left
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        
        int r = 0;
        int c = matrix[0].length - 1;
        
        while(r >= 0 && r < matrix.length && c >=0 && c < matrix[0].length){
            if(matrix[r][c] == target) return true;
            else if(target > matrix[r][c]) r++; //Move down
            else if(target <= matrix[r][c]) c--; //Move left
        }
        
        return false;
    }
}