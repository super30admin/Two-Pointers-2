// Time Complexity :O(m+n) m is the row length abd n is the column length
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Since the array is sorted I have taken the pos of the pointer
// at the bottom left corner. If the target is greater from the element at the pointer then move to the right else move to the top.
// if the pointer goes out of bound the number is not present. 

// Your code here along with comments explaining your approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length-1; int n = matrix[0].length-1;
        int i = m; int j = 0;
        while(i>=0 && j<=n){
            
            if(matrix[i][j] == target) return true;
            
            if(target < matrix[i][j]){
                i--;
            }
            else{
                j++;
            }
        }
        return false;
    }
}