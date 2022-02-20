/*
Since the matrix is sorted by column and row, we can easliy know that:
matrix[ i ] [ j ]  <= matrix [ i-1 ] [ j ]
matrix[ i ] [ j ]  >= matrix [ i ] [ j-1 ]
For the element in the top right (or bottom left), we could find out:
if target < top right, then target cannot be in last column.
if target > top right, then target cannot be in the first row.
Therefore, search from the top right (or bottom left) with two pointers (for row and column), will eliminate either a row or a column in each iteration, the overall time complexity is O(m + n).

SC: O(1)
TC: O(M+N)
*/

class Searcha2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int nRow = matrix.size();
        if (nRow == 0) {return false;}
        int nCol = matrix[0].size();
        if (nCol == 0) {return false;}
        int i = 0;
        int j = nCol - 1;

        while (i < nRow && j >=0){
            if (matrix[i][j] < target){
                i++;
            }else if (matrix[i][j] > target){
                j--;
            }else{
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args)
    {
        int[][]matrix = {
                {1, 5, 9, 11},
                {13, 16, 19, 24},
                {28, 30, 38, 50}
        };

        int target = 38;

        System.out.println(searchMatrix(matrix, target));
    }
}