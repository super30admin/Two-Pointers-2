/*TC - O(N)
 *SC - O(1)
 *Ran on leetcode  - yes
 * */

// Approach - start from top right and move down if target is greater, else decrement the row otherwise 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0; 
        int col = matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if (matrix[row][col] == target){
                return true;
            }else if (matrix[row][col] < target){
		    // we need to find greater element 
                row += 1;
            }else {
		    // need to look for a number in smaller set
                col -=1;
            }
        }
        return false;
    }
}



