// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
Approach: Started from the element present at 1st row and last column. Compared target with that element, if target is greater than the current element move downwards.
If target is smaller than the current element then move towards left direction.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int column = n - 1;

        while (row < m && column >= 0) {

            if (target == matrix[row][column]) {
                return true;
            } else if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }
        return false;
    }
}

// Time Complexity : O(m*n) => As we iterate over the entire matrix with m rows and n columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
Brute Force Approach: Used 2 for loops to compare each element with the target
 */
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {

//         int m = matrix.length;
//         int n = matrix[0].length;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == target) {
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }
// }