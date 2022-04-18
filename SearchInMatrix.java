// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:   Take two pointes r and c. If matrix[r][c] > target, then r--; Else c++;

class SearchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int r = m - 1, c = 0;
        
        while(r >= 0 && c < n) {
            
            if(matrix[r][c] == target) {
                return true;
            }
            
            if(matrix[r][c] > target) {
                r--;
            } else {
                c++;
            }
        }
        return false;
    }
}