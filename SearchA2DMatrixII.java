package twoPointers2;

public class SearchA2DMatrixII {
	//Time Complexity : O(n+m), where n is rows and m is columns
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        
        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        
        return false;
    }
	
	//Time Complexity : O(n*m), where n is rows and m is columns - Brute Force
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public boolean searchMatrix2(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == target)
                    return true;
            }
        }
        
        return false;
    }
}
