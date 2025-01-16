//Search a 2D Matrix II
//Can do Brute force where we use 2 loops and the TC: O(m*n)
//Binary search for each colum or row which give either tc: O(mlogn) or O(nlogm)
//Use 2 pointer we can achieve TC in O(m+n)
//SC: O(1)

class searchATwodMatrixtwo {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int col = n - 1;
        //Starting from row 0 and col n-1 and traversing left if matrix[row][col] > target down if matrix[row][col] < target
        while (row <= m - 1 && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}