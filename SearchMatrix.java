// Time Complexity : O(M+N) M is number of rows and N is number of columns.
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Not on Leetcode
// Any problem you faced while coding this : No

class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        int row = matrix.length-1;
        
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]<target)
                col++;
            else if(matrix[row][col]>target)
                row--;
            else
                return true;
        }
        return false;
    }
}