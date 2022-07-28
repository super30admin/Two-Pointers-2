// TC: O(m*logn)
// SC: O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length-1;
        for(int i=0;i<m;i++) {
            
            int low = 0;
            int high = n;
            while(low<=high) {
                int mid = low + (high-low)/2;
                if(matrix[i][mid] == target) {
                    return true;
                }
                
                if(target < matrix[i][mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
        
    }
}
