
// Time Complexity : O(n+m), where m is the number of rows and n is the number of columns
// Space Complexity : O(1), no extra space used
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
//1. Since the rows and column are sorted in ascending order, we can start iterating the matrix from either top right or bottom left cell
//2. If the target is greater than the current element move to the next row in the same column ,else move to the previous column in the same row
//3. Keep doing this till you find the target OR the indexs go out of bound

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //if matrix is null or empty return false
        if(matrix == null || matrix.length ==0) return false;

        //length of the row
        int m = matrix.length;
        //length of the column
        int n = matrix[0].length;
 
        //start from top left
        int i = 0;
        int j = n-1;
        
        while( i < m  && j >= 0){
            //if target found return true
            if(matrix[i][j] == target) return true;
            
            //if target is greater than current element then move to the next row in the same column
            if(target > matrix[i][j]){
               i++;
            }
            else{ // else move to the previous column in the same row
                j--;
            }
        }
        //if not found return false
        return false;
    }
}