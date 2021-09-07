// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
public class search {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //start from last column of first row.
        int row = 0;
        int col_max = matrix[0].length-1;
        
        //move down or left to find the element
        while(row < matrix.length && col_max >= 0){
            if(matrix[row][col_max] == target) return true;
            else if(matrix[row][col_max] > target) col_max--;
            else row++;
        }
        
        return false;
    }
}
