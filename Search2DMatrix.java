class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        
        while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                i++;
            // if(matrix[i][j] > target)
            else
                j--;
        }
        return false;
    }
}

//Time complexity : O(M*N)
//Space complexity : O(1)
