
// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Start from the top-right corner and compare the target with the current element.
// If the target is smaller, move left; if larger, move down.
// This eliminates one row or one column at each step, ensuring efficient search.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i =0;
        int j = n-1;
        while (j >=0 && i <m){
            if (target == matrix[i][j]){
                return true;
            }else if(target < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false; 
    }
}