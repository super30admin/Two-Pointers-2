//https://leetcode.com/submissions/detail/623577993/
Time: O(m+n)
Space:O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int column = matrix[0].length - 1;
        
        while(row < matrix.length && column>=0) {
            
            if(matrix[row][column] == target) {
                return true;
            }
            else if(matrix[row][column] > target) {
                column--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}