// Time Complexity : O(m+n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//240. Search a 2D Matrix II

public class Problem3 {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int i = 0, j = n-1;
        while(i<m && i>=0 && j<n && j>=0){
            if(matrix[i][j] == target) return true;
              else if(matrix[i][j] > target) j--;
                else if(matrix[i][j] < target) i++;
        }
        return false;
    }
}
