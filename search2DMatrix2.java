// Time Complexity: O(n) where n is a product of elements in a column times elements in a row
// Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mMax = matrix.length; int nMax = matrix[0].length;
        int m = 0; int n = nMax - 1;
        
        while(m < mMax && n >= 0){
            if(matrix[m][n] == target) 
                return true;
            else if(matrix[m][n] < target) 
                m = m + 1;
            else 
                n = n - 1;
        }
        return false;
    }
}