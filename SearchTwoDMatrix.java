class SearchTwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n= matrix[0].length;
        // can choose two starting points first row last col or last row first col
        int i=0;
        int j=n-1;
        while(i<m && j>=0)
        {
            //inc row or dec col
            if(matrix[i][j] == target)
            return true;
            if(matrix[i][j]< target)
            i++;
            else
            j--;
        }
        return false;
    }
}

//tc: O(m+n)
//sc: O(1)