/*
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix is None or len(matrix) == 0:
            return False
        
        rows, cols = len(matrix), len(matrix[0])
        i, j = 0, cols - 1
        
        while i < rows and j > -1:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1
        return False
*/

// Time Complexity : O(rows+cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach: I can start with upper right or bottom left and leverage the fact that
// matrix is sorted row wise and col wise and then move in required direction

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int i = 0, j = cols - 1;
        
        while (i < rows && j > -1){
            if (matrix[i][j] == target){
                return true;
            }
            else if (matrix[i][j] < target){
                i ++;
            }
            else{
                j --;
            }
        }
        
        return false;
    }
}
