// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(m) + O(n) i.e O(m) for iterating through the rows and O(n) for iterating through the columns
//Space Complexity: O(1) since we are not taking any extra space

    public boolean searchMatrix(int[][] matrix, int target) 
    {        
        int nrows = matrix.length;
        int ncols = matrix[0].length;
        int left = 0;
        int right = ncols-1;
        
        while(left < nrows && right >= 0){
            
            if(matrix[left][right] == target) return true;
            else if(matrix[left][right] < target){
                left++; // Since the rows are sorted, we can safely assume that the target lies on to the right side
            }
            else{
                right--;
            }
        }
        return false;
    }

