
public class Search_in_a_2D_matrix {
	//Approach: Traverse through each element of the matrix searching for the target using 2 loops, if found return true else return false
	 public boolean searchMatrix1(int[][] matrix, int target) {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                if(matrix[i][j]== target)
	                    return true;
	            }
	        }
	        return false;
	 }
	//Time Complexity : O(m*n) 
	//Space Complexity : O(1) 
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this :
	 
	 public boolean searchMatrix2(int[][] matrix, int target) {
		 //Approach: 1. For better performance, I have written binary search function, since all the rows and columns are sorted.
		 //2. I will pass each row to binarySearch function and search for target if found in any of the rows we will return true else return false at the end.
	        for(int i=0;i< matrix.length;i++)
	        {
	            if(binarySearch(matrix, i, target))
	                return true;
	        }
	        return false;
	 }
	    public boolean binarySearch(int[][] matrix, int i, int target)
	    {
	        int row = i;
	        int left = 0;
	        int right = matrix[0].length-1;
	        while(left <= right)
	        {
	            int mid = left + (right-left)/2;
	            if(matrix[row][mid] == target)
	                return true;
	            else if(target < matrix[row][mid])
	                right = mid-1;
	            else
	                left = mid+1;
	        }
	        return false;
	   }
	 //Time Complexity : O(m * log n) 
	//Space Complexity : O(1) 
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this :
	    
	public boolean searchMatrix3(int[][] matrix, int target) {
		//Approach: 1. We can do better by reducing search space, for this we start testing with the special corners -"can try all the four corners and search a specific target "
		//2. If at any of the corners we can reduce the movements, for example if we choose top left corner cannot decide where the target is, rows and columns are sorted,
		//but still cant reduce any directions.
		//3. But choosing, top right or bottom left, we can see the possibility of reducing movements, ex - choose top right, if target is lesser than matrix element u need to go left,
		//not in the down direction bcoz columns are sorted too, and we will face all bigger elements down. but if target is greater than matrix element, we have to go down, 
		//bcoz, row is sorted, and we might not find target in the left side too. Hence, the movements is reduced to two either left or down. 
		//4. If we do the search in this manner we will find the element in O(m+n) or we will be out of the matrix.
        if(matrix == null || matrix.length == 0)
            return false;
        int rows = matrix.length, columns = matrix[0].length;
        int i=0, j=matrix[0].length-1;
      
        while(i < rows && j >=0 )
        {
            if(matrix[i][j] == target)
                return true;
            else if(target < matrix[i][j] )
                j--;
            else
                i++;
        }
        return false;
    }
	//Time Complexity : O(m + n) 
	//Space Complexity : O(1) 
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this :
}
