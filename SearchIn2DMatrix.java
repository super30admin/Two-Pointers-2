// Time Complexity : O(m + n) where m is length of row and n is length of column of input matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class SearchIn2DMatrix{
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        
        int row = matrix.length, col = matrix[0].length;
        int r = 0, c = col - 1;
        
        while(r < row && c < col && r >= 0 && c >= 0){
            int curr = matrix[r][c];
            if(curr == target){
                return true;
            }else if(curr > target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}