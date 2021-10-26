// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Search2DMatrix_II {
	 public boolean searchMatrix(int[][] matrix, int target) {
	      int i=0;
	        int j=matrix[0].length-1;
	        while(i<matrix.length && j>=0){
	            if(matrix[i][j]<target){
	                i++;
	            }else if(matrix[i][j]>target){
	                j--;
	            }else{
	                return true;
	            }
	        }
	        
	        return false;
	 }
}
