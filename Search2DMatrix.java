// Time Complexity : O(n + m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Start from bottom left corner
//If no. is less than target  go right
//If no. is greater than target go up.
//If no. found return true, if iterations are over means no. is not present hence return false.
// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while(i >=0 && j < matrix[0].length){
            if(matrix[i][j] > target)
                i--;
            else if(matrix[i][j] < target)
                j++;
            else
                return true;
        }
        return false;
    }
}