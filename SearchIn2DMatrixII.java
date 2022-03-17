//Time Complexity O(r+c)
//Space complexity O(1)
//Leetcode tested

public class SearchIn2DMatrixII {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int r=0;int c = matrix[0].length-1;
        while (c>=0 && r<matrix.length){
            if(matrix[r][c]== target)
                return true;
            else if(matrix[r][c]<target)
                r++;
            else c--;
        }
        return false;
    }
}
