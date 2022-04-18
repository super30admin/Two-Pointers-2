// Time Complexity :O(m+n) m is col and n is row
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : start bottom left of the matrix,
// if element is less than target, move right, if more than target, move up

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;

        int row = matrix.length-1;
        int col = 0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] < target)
                col++;
            else
                row--;
        }
        return false;
    }
}
