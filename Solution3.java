// Time complexity: O(mlogn), where m is the number of rows in the matrix and n is the number of columns in the matrix.
// Space complexity: O(1).
// Did this code run on leetcode: Yes

class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; 
        int n = matrix[0].length; 
        
        for (int i = 0; i < m; i++) {
            // performed binary search on each row if the target lies between the first element and the last element.
            if(matrix[i][0] <= target && target <= matrix[i][n-1]) {
                int low = 0, high = n-1; 
                while(low<=high) {
                    int mid = low+(high-low)/2;
                    if(matrix[i][mid] == target) {
                        return true;
                    }
                    else if(matrix[i][mid] > target) {
                        high = mid-1;
                    }
                    else {
                        low = mid+1; 
                    }
                }
            }
        }
        
        return false;
    }
}
