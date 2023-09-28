//Leetcode Problem : https://leetcode.com/problems/search-a-2d-matrix-ii/description/
// Time Complexity : O(n+m) where 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I set i to 0 and j to columns-1 so that the last element of first row is 
 * under consideration. I go on reducing the search space since all elements
 * are both column and row sorted. If matrix[i][j] == target I return true,
 * else if matrix[i][j]<target, I increment i and start searching from the
 * next row onwards. Else I set j-- (checking in previous column).
 * I exit the loop if I reach the last element of first column and return false.
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i=0,j=columns-1;
        while(i<rows && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}