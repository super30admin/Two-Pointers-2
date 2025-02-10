//TC: O(row x col)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = row-1;
        int j = 0;
        while(i >= 0 && j <= col-1){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                i--;
            else
                j++;
        }
        return false;
    }
}
