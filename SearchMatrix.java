//Time Complexity : O(m+n)
//Space Complexity : O(1)

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        //Starting point - > top right corner
        while(r < matrix.length && c >=0) {
            if(matrix[r][c] == target)
                return true;
            if(target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
