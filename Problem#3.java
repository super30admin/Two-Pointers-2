// 240. Search a 2D Matrix II (PR#37 S30)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0)
            return false;
        
        int m = matrix.length, n = matrix[0].length;
        
        int i =0, j = n -1;
        
        while(i < m && j >=0 ) {
            
            if( matrix[i][j] == target) {
                return true;
            }
            
            else if (target > matrix [i][j]) {
                i++;
            }
            else {
                j--;
            }
        }
        
        return false;
    }
}

/*
Complexity Analysis

Time complexity : 
O(n+m)

Space complexity : 
O(1) Because this approach only manipulates a few pointers, its memory footprint is constant. 
*/