
// Time Complexity : O(rc)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
when know that from right to left in a row, the items are decreasing
when know that from top to bottom the itens are increasing
we will use this knowledge to traverse the matrix
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // edge cases
        if(matrix == null || matrix.length ==0){
            return false;
        }

        // we will start with top right

        int r = 0;
        int col = matrix[0].length-1;

        while((r>=0 && r<matrix.length) && (col>=0 && col< matrix[0].length)){

            int current = matrix[r][col];
            //if current is bigger we need to seek smaller value

            if(current  == target){
                return true;
            }else if(current > target){
                col--; // go left
            }else{
                r++;//go down
            }

        }

        return false;

        
    }
}