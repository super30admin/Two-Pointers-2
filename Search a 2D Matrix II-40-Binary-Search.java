class Solution {
    // Brute Force Approach: Binary Search
    // Time Complexity: n O(log(m)) where m is number of rows and n is number of columns
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null|| matrix.length==0)
        {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
// Fixing the columns and then traversing each row
        for(int i=0;i<n;i++)
        {
            if(matrix[0][i]<=target)
            {
                int low = 0;
                int high = m-1;
            while(low<=high)
            {
                int mid = low+(high-low)/2; // Integer Overflow Exception
                if(matrix[mid][i] > target)
                {
                    high = mid-1;
                }
                else if(matrix[mid][i] < target)
                {
                    low = mid+1;
                }
                else {
                    return true;
                }
            }
            }
        }
        return false;
    }
}
