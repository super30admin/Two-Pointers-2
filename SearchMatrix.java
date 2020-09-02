// TC: O(M+N) where M is row and N is cols size of the matrix
// SC: O(1) since we are not using extra memory

// SInce the array is sorted in row and column wise, we can implement Binary search considering row and col as my indices to traverse right or down.

public class SearchMatrix {
	
	public boolean Search(int[][] matrix, int target) {
		
		if(matrix==null || matrix.length<1 || matrix[0].length<1)
			return false;
		
		int row = 0;
		int col = matrix[0].length-1;
		
		while(row < matrix.length && col>=0) {
			
			if(target==matrix[row][col])
				return true;
			else if(target< matrix[row][col])
				col--;
			else row++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		SearchMatrix sm = new SearchMatrix();
		int[][] matrix = {{1,   4,  7, 11, 15}, {2,   5,  8, 12, 19}, {3,   6,  9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
		int target = 5;
		System.out.println(sm.Search(matrix, target));
		
	}

}
