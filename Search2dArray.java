// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        //All the elements in a row are in increasing order and all elements in a column are also in inc order

        //Start searching from last row and first col [m - 1, 0]
        int r = m - 1;
        int c = 0;
        //We can also start at r = 0, c = n -1, if target is > then row++ and less then col--

        
        while(r >= 0 && c < n) {

            if(matrix[r][c] == target)
                return true;

            //search upper row
            else if(target < matrix[r][c])
                r--;
            //search on the right
            else
                c++;
        }

        return false;

        //Time complexity = O(m + n)
        //Space complexity = O(1)
    }
}