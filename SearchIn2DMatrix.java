
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english
// in this problem  i am using a pointer and moving the pointer based on the target value and checks if the pointer matches the target 
// or move the pointer to right if the target is greater than pointer or to upwards if the target is less than pointer.
// Your code here along with comments explaining your approach

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (target < matrix[i][j]) {
                i = i - 1;
            } else if (target == matrix[i][j]) {
                return true;
            } else {
                j = j + 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        SearchIn2DMatrix obj = new SearchIn2DMatrix();
        int matrix[][] = { { -1, 3 } };
        int target = 3;
        System.out.println(obj.searchMatrix(matrix, target));
    }
}
