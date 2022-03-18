// Time Complexity :O(m+n)
// Space Complexity :O(1)
class SearchInMatrix {	
	public boolean searchMatrix(int[][] matrix, int target) { 
		if(matrix==null || matrix.length==0) return false;
		
		//Staircase Search  in matrix
		int m=matrix.length;
		int n=matrix[0].length;		
		int i=0;
		int j=n-1;		
		while(i<m && j>=0) {
			if(matrix[i][j]==target) {
				return true;
			}else if (matrix[i][j] > target) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
	
	// Driver code to test above 
    public static void main(String args[]) { 
    	SearchInMatrix ob = new SearchInMatrix();
    	int[][] nums = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    	int target=5;
    	System.out.println("Target found in matrix: "+ ob.searchMatrix(nums,target));
    }  
}