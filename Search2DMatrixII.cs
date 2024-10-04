// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// This approach starts searching from the top-right corner of the matrix. 
//If the current element is greater than the target, 
//move left (decrement the column), and if it's smaller, move down (increment the row). 
//The process continues until either the target is found or the search space is exhausted.

public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        // top right, can be done using bottom left as well
        int r=0, c= n-1;
        
        while(r<m && c>=0){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}