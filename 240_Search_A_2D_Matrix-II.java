
// Time Complexity : O(rows+cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col])
                return true;
            if(target<matrix[row][col])
                col--;
            else if(target>matrix[row][col])
                row++;
        }
       
        return false;
    }
}
