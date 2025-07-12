// We perform sort of Binary Search by eliminating entire rows or cols at a time
// This is most optimal solution
// TC: O(m+n) - At most m times we move down and at most n times you move left
//  SC: O(1) - No additional space is required

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if ((matrix == null) || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        int m = matrix[0].length;
        int n = matrix.length;
        int i = 0; // First row
        int j =  m - 1; // Last Coloumn
        while(i <  n && j >= 0){
            // If target is found return true
            if(matrix[i][j] == target){
                return true;
            }
            // if right most element is less than target that means we can eliminate the row and move to next row
            else if (matrix[i][j] < target){
                i = i + 1;
            }
            // if right most element is greater than target that means we can eliminate the coloums and move to left col
            else{
                j = j - 1;
            }
        }
        return false;
    }
}
