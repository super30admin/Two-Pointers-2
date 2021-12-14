// Time Complexity : O(row + col)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * We start from 1st row and last column.
 * Now target is greater than this element we can find it by incrementing row as there higher elements lies
 * We target is smaller than current element, we decrement column as there lower element lies.
 * We continue our search like this till current element is target or current row number and column number both are valid.
 * As soon as we hit invalid row number or column number we can say that element does not present is matrix
 * We can also start from Last row first column. 
 * Here, if target is greater than current element, then we increment column or if target is lower we decrement row number
 * We continue this search till current element is target or current row and column numbers are valid. 
 * if we hit invalid row or column number we return false saying target does not lie in matrix
*/
// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target)return true;
            else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        
        return false;
    }
}