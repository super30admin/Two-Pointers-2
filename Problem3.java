// Time Complexity : 
//      searchMatrix() - O(m + n)
//      
// Space Complexity :
//      searchMatrix() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        
        int ptr1 = 0;
        int ptr2 = n;
        
        while(ptr1 <=m && ptr2 >= 0)
        {
            if(matrix[ptr1][ptr2] == target)
                return true;
            
            else if(matrix[ptr1][ptr2] > target)
                --ptr2;
            else
                ++ptr1;
        }
        
        return false;
    }
}
