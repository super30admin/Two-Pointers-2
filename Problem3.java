// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * We start at the bottom left corner with i as m-1 and column as 0. 
 * If we find the target element at that position in matrix, we return true. 
 * Else if the element is greater than target, we move to the top with row decremented by 1. 
 * If it is lesser, we increment column by 1 and continue searching. If element isn't found, we return false. 
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length; 
    int n = matrix[0].length; 
    int i = m - 1; 
    int j = 0; 
    while(i >=0 && j < n){
        if(matrix[i][j] == target)
            return true; 
        else if(matrix[i][j] > target){
            i--;
        }
        else {
            j++;
        }
    }
    return false; 
    }
}