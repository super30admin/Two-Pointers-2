
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
    We can start from either top- left or bottom right position.
    At each iteration, we move the pointer closer to the element depending on whether it's smaller or
    largen than the current element.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = matrix.length - 1, c = 0;
        
        while(r >=0 && c <= matrix[0].length - 1 ){
            if(matrix[r][c] == target){
                return true;
            } else if(matrix[r][c] > target){
                r--;
            } else{
                c++;
            }
        }
        return false;
        
    }
}