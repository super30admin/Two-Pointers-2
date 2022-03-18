// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Staircase approach where we start either from top-right or bottom-left and either move left or right 
//depedning upon if the value at that index is greater than or less than target respectively

// Your code here along with comments explaining your approach
class Search2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else if(matrix[i][j] == target){
                return true;
            }
        }
        return false;
    }
}
