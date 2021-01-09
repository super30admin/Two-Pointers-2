// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Due to the sortedness of the matrix, we can move rows up if the current element is less than the target,
 // and move column left if the current element is more than the target. 
 //If we exit the matrix without finding the element, then the taregt does not exist in the matrix. 

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                row++;
            }else if(matrix[row][col] > target){
                col--;
            }
        }
        return result;
    }
}