// Time Complexity : O(mn)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
            for (int i = 0; i < matrix.length; i++) {
                
            for (int j = 0; j < matrix[0].length; j++) {
                
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
    }
