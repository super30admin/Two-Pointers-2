/*
Time Complexity - O(N) where is the size of the input array matrix.
Space complexity - O(1) 
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;

        while(row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length) {
            int curVal = matrix[row][col];
            if(curVal == target)    return true;

            if(curVal < target)
                row++;
            else
                col--;
        }
        return false;
    }
}
