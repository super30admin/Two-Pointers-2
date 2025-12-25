/*
240. Search a 2D Matrix II
Ran on leetcode: Yes
TC: O(m + n) SC: O(1)
Since the row and column are both sorted, we can start at top right corner, move down if the target is greater than current element and move left if the target is smaller until we find the target or return false.
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int cLen = matrix[0].length, rLen = matrix.length; // Dimensions of matrix
        int c = cLen - 1, r = 0; // Top - Right column index
        
        while(r < rLen && c >= 0){ // Index is valid
            if(matrix[r][c] == target){ // Target found
                return true;
            } else if(matrix[r][c] > target){ // Element is greater than target
                c--; // Move left
            } else { // Element is smaller than target
                r++; // Move down
            }
        }

        return false; // Element not found
    }
}