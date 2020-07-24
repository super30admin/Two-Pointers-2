/***********************************Brute Force************************************/
// Time Complexity : O(m * n)
// Space Complexity : 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

public class Search_a_2D_MatrixII {
	public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }
	
	
/************************************Binary Search Approach***************************/
// Time Complexity : O(m * log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Search_a_2D_MatrixII {
	public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        
        for(int i=0; i<matrix.length; i++){
            int low = 0, high = matrix[i].length -1;
            
            while(low <= high){
                int mid = low + (high-low) /2;
                
                if(matrix[i][mid] == target)
                    return true;
                else if (matrix[i][mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }    
        return false;
    }
	
/*******************************Optimal Solution( Top right corner)*************************/
// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*considering mid point as the top right corner. 
 * If the element at mid is greater than target, then search towards the left column
 * If the element is greater than target, then search towards the next row 
 * If pointers move out of the matrix means target is not present, so return false.*/

public class Search_a_2D_MatrixII {
	public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n-1;     // index of top right corner
        while(i < m && j >= 0){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)  // if current number is greater than target, move to the left column
                j--;    
            else    // if current number is less than target, move to the next row
                i++;
        }
        return false;
    }

	public static void main(String[] args) {
		int[][] matrix = {
		  {1,   4,  7, 11, 15},
		  {2,   5,  8, 12, 19},
		  {3,   6,  9, 16, 22},
		  {10, 13, 14, 17, 24},
		  {18, 21, 23, 26, 30}
		  };
		int target = 5;
		
		System.out.print(searchMatrix(matrix, target));
	}
}
