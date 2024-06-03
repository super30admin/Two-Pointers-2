/***
 Approach - Using 2 pointers
 1. Start with row=0 and column=n-1, check if the element at current(row,column) is equal to target, then returns true
 2. If the element is greater than target, then move left
 3. if the element is smaller than target, then move down
 TC - O(m+n), SC - O(1)
 */
class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = n-1;

        while(i >= 0 && i < m && j >=0 && j < n) {
            if(matrix[i][j] == target)
                return true;

            else if(matrix[i][j] > target) {
                //move left
                j--;
            }

            else {
                //move down
                i++;
            }
        }

        return false;

    }
}