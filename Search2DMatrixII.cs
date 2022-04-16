
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/search-a-2d-matrix-ii/
	// 2) Use one pointer, u can start 
	// 	a. last row and first column
	// 	b. First row and last column
	// 3) We cannot start at 0,0 or m,n because both eleemnts are those elements ar large or small
	// 4) Lets choose last row and first clumn
	// 	a. If target is greater than element , move right
	// 	b. Else move up
	// 	c. If u find the element return true
	// 	d. If u reach out of bound, it means element don’t exists, return false.


public bool SearchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.Length == 0)
            return false;
        
        int m = matrix.Length;
        int n = matrix[0].Length;
        int i = m - 1;
        int j = 0;
        while(i >= 0 && j < n)
        {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                j++;
            else
                i--;
        }
        return false;
    }