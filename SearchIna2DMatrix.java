// brute force
public class SearchIna2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix==null || m<0) return false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

// TC - O(m*n)
// SC - O(1)

// optimized
public class SearchIna2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix==null || m<0) return false;
        int i = 0, j = n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target) i++;
            else j--;
        }
        return false;
    }
}

// TC - O(m+n)
// SC - O(1)