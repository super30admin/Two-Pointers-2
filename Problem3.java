// 240. Search a 2D Matrix II
    
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

The key to the time complexity analysis is noticing that, on every iteration (during which we do not return true) either row or col is is decremented/incremented exactly once. Because row can only be decremented 
m times and col can only be incremented 
n times before causing the while loop to terminate, the loop cannot run for more than 
n+m iterations. Because all other work is constant, the overall time complexity is linear in the sum of the dimensions of the matrix.

Space complexity : 
O(1) Because this approach only manipulates a few pointers, its memory footprint is constant. 
*/
