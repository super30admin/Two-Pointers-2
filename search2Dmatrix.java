// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH (Top-right):
Using the 2 pointer approach:
first pointer will point to the row, second pointer will point to the column
first pointer will start from the first row, second pointer starts from the last column
1. if(matrix[pointer1][pointer2] > target) we move towards the left in the row to find a smaller number, pointer2--
2. if(matrix[pointer1][pointer2] < target) we move down the column to find a greater number, pointer1++
*/

import java.util.Arrays;

public class search2Dmatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(null == matrix || matrix.length == 0) return false;

        // 2-pointer solution: O(m+n) (bottom-left)
        int im = matrix.length-1, jn = 0;
        while(im>=0 && jn<matrix[0].length){
            if(matrix[im][jn] > target){
                im--;
            }else if(matrix[im][jn] < target){
                jn++;
            }else {
                return true;
            }
        }
        return false;

        // 2-pointer solution: O(m+n) (top-right)
        /* int im = 0, jn = matrix[0].length-1;
        while(im<matrix.length && jn>=0){
            if(matrix[im][jn] > target){
                jn--;
            }else if(matrix[im][jn] < target){
                im++;
            }else {
                return true;
            }
        }
        return false; */
    }

    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target)); // true

        int[][] matrix2 = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target2 = 20;
        System.out.println(searchMatrix(matrix2, target2)); // false
    }
}
