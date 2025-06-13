// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Approach - my approach is to set my pointer at first row and last column , and as the array is sorted rowwise and
// columnwise I can reduce the space on search space on basis whether the target is greater or smaller, or it is the
// target element

public class Search2dMatrixTwo {
    static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >= 0) {
            if(matrix[row][col] == target) return true;

            if(matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        System.out.println("Is target there: " + searchMatrix(matrix, target));
    }
}
