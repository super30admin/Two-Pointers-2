/*
Time Complexity: O(n+m)
Space Complexity: O(1)
Run on leetcode: yes
Any difficulties: no

Approach:
two pointers
 */
public class SearchA2DMatrixII {
    public static boolean searchIn2DMatrix(int[][] matrix, int target){
        int row = matrix.length-1;
        int col = 0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]> target){
                row--;
            }else if(matrix[row][col]<target){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};

        System.out.println(searchIn2DMatrix(matrix, 5));
    }
}
