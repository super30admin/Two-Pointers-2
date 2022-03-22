/*
Time Complextiy : O(n+m)
Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Here as per the que. constrains like all rows are sorted and all columns are sorted started from the last 
column and check if target less then the value of then change the column otherwise change the row.

//  
*/

public class matrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {

            if (matrix[i][j] == target) {

                return true;
            } else if (matrix[i][j] < target) {

                i++;
            } else {

                j--;
            }
        }

        return false;
    }
}
