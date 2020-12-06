// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. compare your target with element at matrix[rows][0]
// 2. at this point we know that elemnts to the right are greater  and above are less than the current elemet and 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int row = matrix.length - 1;
        int col = 0;
        
        while(row >=0 && col < matrix[0].length) {
            if(matrix[row][col] < target)
                col++;
            else if(matrix[row][col] > target)
                row--;
            else
                return true;
        }
        return false;
    }
}