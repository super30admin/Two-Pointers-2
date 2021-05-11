/*The logic is the the target can be found out if we start from the top-right corner or from the bottom left corner.
That way, we will always have a direction we should be looking in. If we are starting from the top-right, deepnding on if the target is greater
or smaller, we keep tarversiong the matrix.

Time complexiy: O(M*N)
Space complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowPointer = 0;
        int colPointer = matrix[0].length-1;
        
        while(rowPointer<=matrix.length-1 && colPointer>=0)
        {
            if(target==matrix[rowPointer][colPointer])
                return true;
            if(target<matrix[rowPointer][colPointer])
                colPointer--;
            else
                rowPointer++;
        }
        return false;
    }
}