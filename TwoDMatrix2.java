class TwoDMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //null
        if(matrix == null || matrix.length == 0) return false;
        //TC:O(r+c) ; SC: O(1)
        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1; 
        int j = 0;
        while(i >= 0 && j < n ) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) j++;
            else i--;
        }
        return false;
    }
}

// int i = 0; 
//         int j = n-1;
//         while(i < m && j >= 0 ) {
//             if(matrix[i][j] == target) return true;
//             else if(matrix[i][j] < target) i++;
//             else j--;
//         }