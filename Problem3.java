// Time Complexity : O(m+n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
I will follow a stair-case pattern, I will start at the first row and last column. Since the property of sorted matrix exists.
If the current element is greater than the target that means there is a possiblity that element exists in the left side so decrease the column by 1.
If the current element is smaller. It means that there is a possibility that elements exists in the below, so increase the row by 1.
*/

public class Problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            int element = matrix[row][col];
            if(element == target) {
                return true;
            } else if(element > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
