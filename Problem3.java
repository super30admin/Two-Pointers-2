// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * We are using a two pointer approach to reduce the search space and reach towards the target. Since,
 * the matrix is sorted from rows and columns we will be moving either left or down until we reach the target.
 */

// Your code here along with comments explaining your approach

public class Problem3 {
    //brute force approach
    //Time complexity = O(m*n)
//        int m = matrix.length;
//        int n= matrix[0].length;
//
//        for(int i=0; i<m; i++){
//
//                for(int j=0; j<n; j++){
//
//                        if(matrix[i][j] == target) return true;
//
//                }
//
//        }
//        return false;

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        //two pointer approach
        //this will reduce the search space as we will be going either down or left
        //which would be towards the target element
        int i = 0;
        int j = n - 1;

        //i goes down row wise
        // j moves left column wise
        while (i < m && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] == target) {
                return true;
            } else
                i++;

        }
        return false;

    }

    }
