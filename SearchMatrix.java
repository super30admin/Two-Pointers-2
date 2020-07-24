/**
Problem: Search in a sorted matrix.
Time Complexity: O(m+n) where m is the number of rows, and n is the number of columns of the given matrix.
Space Complexity : O(1)
Did it run on Leetcode: Yes

Approach:
1. We first keep a check on the element present in the last column of the first row.
2. If it is equal to the target, we return true.
3. However, if the target is less than that element, we move left(because we know the matrix is sorted row-wise and column wise)
4. If the target is more than that element, we move downward. We keep repeating this until we try to find the element. We return false, otherwise.
*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n -1;
        //matrix[i][j] currently points to the last element of the first row
        while(i<m && j>= 0) {
            if(matrix[i][j] == target) {
                return true;
            }
            else if(matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}