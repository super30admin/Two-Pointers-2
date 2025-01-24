// Time Complexity :O(M+N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
public class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)
            return false;
        int row = 0;
        int r = matrix.length;
        int col = matrix[0].length-1;
        while(col>=0 && row < r){
            if(target==matrix[row][col])
                return true;
            if(target>matrix[row][col]) row++;
            else col--;
        }
        return false;
    }
}
