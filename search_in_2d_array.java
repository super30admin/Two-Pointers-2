//Time Complexity: O(m+n)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length; int n = matrix[0].length;
        int r = 0; int c = n-1;
        
        while(r < m && c >= 0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) r++;
            else c--;
        }
        return false;
        
        
    }
}
