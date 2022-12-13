// Time Complexity :O(M+N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: take two pointers and start from the back 

// Your code here along with comments explaining your approach

	
public class Search2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
	        
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int r = 0;
	        int c = n-1;
	        while(r < m && c>=0 ){
	            if(matrix[r][c]==target){
	                return true;
	            }
	            else if(matrix[r][c] < target){
	                r++;
	            }else{
	                c--;
	            }
	            
	        }
	        return false;
	        
	    }
}
