/* Time complexity: O(m+n); where m is the number of rows and n is the number of columns
Space complexity: O(1)

1. Starting the search with the topleft element or bottom right element as it would give us
a better decision making capacity of which direction to move next if the target is not found in there 
as in this problem, both rows and columns are sorted.
2. If the target doesnt match the topleft element or bottom right element, move to previous column or next row depending on
whether the target is higher/lower that the topleft element.
3. Continue in the same way until you find the target.

*/

class Solution{
    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(i < m && j < n){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                i--;
            }
            else{
                j--;
            }
        }
        return false;
    }
}

