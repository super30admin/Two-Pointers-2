// Time Complexity :o(m+n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english
//since rows are sorted and colomns are sorted making use of it,
//starting from  top right corner of the matrix
//if the target is == to the i,j return true
//if targer is greater rw++
//if smaller col--
//after exiting loop if element hasnt been found return false

// Your code here along with comments explaining your approach

public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n= matrix[0].length;
        int row = 0;
        int col =n-1;
        while(row<m && col>=0){
            if(target==matrix[row][col]){
                return true;
            } else if (target>matrix[row][col]){
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}
