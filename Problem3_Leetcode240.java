// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// brute force
// Solution 1: m*n (using 2 for loops and checking each cell value)

// Solution 2: binary search at each row

//     row 1 bs logN
//     row 2 bs logN
//     row 3 bs logN
//     row 4 bs logN
//     row 5 bs logN

//     if we perform binary seach on each row
//     (m*logN) Or

//     if we perform binary seach on each column
//     (n*logM)

// Solution 3: two pointers
// 	TC: O(M+N)
// 	SC: O(1)

// 	2D array representation
// 	index    0 1 2 3  4   total columns = n = 5
// 	[0]     [1 4 7 11 15]
// 	[1]     [2 5 8 12 19]
// 	[2]     [3 6 9 16 22]
// 	total rows = m = 3

//     m = 3
//     n = 5

//     target = 3
//     i = row = 0
//     j = col = 4

//     we will start from cell at first row last column because from there we can move in specific direction based on condition
//     1. since left side has decreasing values so we will move left if target is less than current cell value
//     2. since down side has increasing values so we will move down if target is greater than current cell value

//     matrix[i][j] =
// 	   matrix[0][4] = 15 move left
//     matrix[0][3] = 11 move left
//     matrix[0][2] = 7   move left
//     matrix[0][1] = 4   move left
//     matrix[0][0] = 1   move down
//     matrix[1][0] = 2   move down
//     matrix[2][0] = 3   move down (found target)

// Check below solution

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        // set pointer to first row last column
        int i = 0;
        int j = n - 1;

        // loop until it stays inside matrix
        while(i < m && j >= 0) {

            if(target == matrix[i][j]){
                return true;
            }
            else if(target < matrix[i][j]) {
                j--;
            }
            else {
                i++;
            }
        }

        return false;
    }
}
