//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Search_a_2DMatrix_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
        	return false;
        
        int row = 0;
        int col = matrix[0].length-1;
        
        while(row < matrix.length && col >= 0)
        {
        	if(matrix[row][col] == target)
        		return true;
        	else if(matrix[row][col] < target)
        		row++;
        	else
        		col--;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
    	int[][] arr = {{1,   4,  7, 11, 15},
    			  {2,   5,  8, 12, 19},
    			  {3,   6,  9, 16, 22},
    			  {10, 13, 14, 17, 24},
    			  {18, 21, 23, 26, 30}};
    	Search_a_2DMatrix_240 srch = new Search_a_2DMatrix_240();
    	
    	System.out.println(srch.searchMatrix(arr, 6));
    }
}
