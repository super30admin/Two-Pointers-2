/**
    L.C: 240. Search a 2D Matrix II

        Approach: Matrix traversal (sorted matrix)

        Working:
        Traversing the matrix from row 0 and column n

            when curr value is equal to target
            return true

            check when the target is LESSER than the current value in matrix
            i.e the value may be present on the left side where the smaller values are present
                decrement column
            else //the target is GREATER which may be present on the next row which contains greater value
                increment row

        return false

        Time Complexity: O(m*n)
        Space Complexity: O(1)
 */


class SearchA2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if( matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length-1;
        int n = matrix[0].length-1;

        int row = 0;
        int col = n;

        while(row >=0 && row <=m  && col>=0 && col<=n) {

            int val = matrix[row][col];

            if(val == target) {
                return true;
            }

            if(target < val) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
