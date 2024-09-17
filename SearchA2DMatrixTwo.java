// Time Complexity : O(n+m)n=number of rows and m number of cols in matrix. 
// Space Complexity : O(1) no extra space used.
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Success
//Details 
//Runtime: 5 ms, faster than 92.61% of Java online submissions for Search a 2D Matrix II.
//Memory Usage: 44.5 MB, less than 96.23% of Java online submissions for Search a 2D Matrix II.
 public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null|| matrix.length==0)
            return false;
        int i=0, j=matrix[0].length-1;
        while (i<matrix.length&& (j<matrix[0].length && j>=0)){
            if (matrix[i][j]==target)
               return true;
            else if (matrix[i][j]>target)
               j--;
            else
               i++;
        }
        return false;
    }