// Brute Force
// Time - O(mn) Space - O(1)
// Executed on leetcode successfully
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // explore every element in matrix
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
}

// Optimised
// Time - O(max(m,n))
// space - O(1)
// Executed on leetcode successfully
// Approach: Here we'll be starting our search on two ends of the diagonals
// If we're starting on top right point, if number is greater than target then we'll be decreasing the column
// similarly if the number is lesser than the target, we'll be increasing row
// Eventually we'll reach at our target number if it is available

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int i = 0, j = matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(target==matrix[i][j]) return true;
            if(target > matrix[i][j]) i++;
            else j--;
        }
        return false;
    }
}