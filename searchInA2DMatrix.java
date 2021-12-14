//Time Complexity: O(m+n)
//Space Complexity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j = 0;

        while(i>=0 && j < matrix[0].length){
            if(matrix[i][j]>target)
                i--;
            else if(matrix[i][j]<target)
                j++;
            else
                return true;
        }
        return false;
    }
} 