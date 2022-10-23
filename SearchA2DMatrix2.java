package S30_Codes.Two_Pointers_2;

// Time Complexity = O(m+n)
// Space Complexity = O(1)
// Two-Pointers-2

class SearchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;
        int mid = 0;

        while(row < m && col >= 0){
            mid = matrix[row][col];

            if(target == mid)
                return true;

            if(target < mid)
                col--;

            else
                row++;
        }
        return false;
    }
}