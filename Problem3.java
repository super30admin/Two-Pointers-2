// Time Complexity : 
//      searchMatrix() - O(n*log(n))
//      binSearch() - O(log(n))
//      
// Space Complexity :
//      searchMatrix() - O(1)
//      binSearch() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        
        boolean flag = false;
        
        if(matrix[0].length > 0 && matrix[0][0] <= target)
        {
            int i = 0;
            while(i < matrix.length && matrix[i][0] <= target)
            {
                flag = flag || binSearch(matrix[i], target);
                ++i;
            }
        }
        
        return flag;
    }
    
    private boolean binSearch(int[] arr, int target)
    {
        int l = 0, h = arr.length -1;
        
        while(l <= h)
        {
            int m = l + (h-l) / 2;
            
            if(arr[m] == target)
                return true;
            
            else if(arr[m] < target)
                l = m + 1;
            else if(arr[m] > target)
                 h = m-1;
        }
        
        return false;
    }
}