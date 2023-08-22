// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.*;

public class searchMatrix {

      public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // we start from upper right corner
        int row=0;
        int col= n-1;

        while(row < m && col >=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target>matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        searchMatrix ts = new searchMatrix();
        int[][] m1 = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        int[][] m2 = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        System.out.println(ts.searchMatrix(m1,5));// ans = true
        System.out.println(ts.searchMatrix(m2,20));// ans = false
    }
}
