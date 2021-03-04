
// Time Complexity :
O(m + n) when the number is not present. We are iterating a single row and the column
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :
Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0) return false;
        //we will start from matrix[0][4]
        int m = 0;
        int n=matrix[0].length - 1;
        
        while(m < matrix.length && n >= 0){
            //compare target with matrix[0][4] 
            if(matrix[m][n] == target) return true;
            //if target > matrix[0][4] decrement column
            else if(matrix[m][n] > target) n--;
            //if target < matrix[0][4] increment row
            else m++;
        }
        
        return false;
        
    }
}