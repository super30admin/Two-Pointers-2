// Time Complexity: O(m+n) where m is no of rows & n is number of columns
// Space Complexity :  O(1)


// Approach:
//     Choose the starting point which have certiainity about the target.
//     Loop either to the left or to down until i<m & j>=0
//     Return true if target is found else false;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix ==null || matrix.length <1) return false;
        
        int m =  matrix.length;
        int n = matrix[0].length;
        int i = 0; int j = n-1;
        
        while(i<m && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}