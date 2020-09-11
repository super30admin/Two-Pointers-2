Time Complexity: O(m + n)
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        
        int r = matrix.length - 1, c = 0;
        
        while(r >= 0 && c < matrix[0].length){
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] > target){
                r--;
            } else{
                c++;
            }
        }
        return false;
    }
}
