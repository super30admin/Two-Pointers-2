public class search2dMatrix_2 {
    public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix == null || matrix.length == 0){
        return false;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int row = 0 , col = n-1;
    while(row < m && col >= 0){
        if(matrix[row][col] < target)
            row++;
        else if(matrix[row][col] > target)
            col--;
        else
            return true;

    }
    return false;
}

}
//The time complexity is O(m+n)
//The space complexity is O(1).
