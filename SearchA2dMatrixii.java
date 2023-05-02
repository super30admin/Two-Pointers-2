// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * We saw brute force for checking each element in matrix with O(mn) time complexity. Then as rows and coloumns are sorted;
 * we thought of Binary Search. 1 BS on row mlogn time, 2. BS on col nlogm time or 3. BS on both row and col will have issue. As arrays are sorted we think of TWO POINTERS.
 * We start from row = 0 and col = n - 1 or col = 0 and row = m - 1 because from that position we can decide definitely correct direction to move pointers.
 * if num > target decrease high go left else go down till low and high are in bounds.
 */

public class SearchA2dMatrixii {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = n - 1;
        while(low < m && high >= 0) {
            if(matrix[low][high] == target) {
                return true;
            }
            else if(matrix[low][high] > target) {
                high--;
            }
            else {
                low++;
            }
        }
        return false;
    }
}
