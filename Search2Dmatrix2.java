//TC: O(rows+columns)
//SC: O(1)
//approach: going from right to left and top to bottom, in the row, if target is less than current value, decrease right, else increase row

public class Search2Dmatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int left=0;
        int right=columns-1;
        int n = rows+columns -1;
        int cr=0;
        while(n>0 && left<=right && cr<=rows-1){
            if(target==matrix[cr][left] || target==matrix[cr][right]){
                return true;
            }else if(target<matrix[cr][left] || target>matrix[cr][right]){
                cr++;
            }else if(target<matrix[cr][right] && target>matrix[cr][left]){
                right--;
            }
            n--;
        }
        return false;
    }
}
