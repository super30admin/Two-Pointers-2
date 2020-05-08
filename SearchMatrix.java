// Time Complexity : O(m+n) where m is the number of rows and n is the number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : The first thought came into my mind was Binary Search. I was trying to use that to search in rows and columns
/* Your code here along with comments explaining your approach: Binary Search will fail here due to the configuration of matrix. Hence, we would
use i and j pointers to keep a track. Select the top corner right element as the starting point because it has two different directions to go to. 
One side the elements are increasing and on the other side the elements are decreasing. Compare the target value with the matrix[i][j]. If found,
return. Else if the target is lesser, move to the left by j--. If greater, move downwards by i++. If the pointers reach out of the bounds and the
element is not found, return false.
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null){
            return false;}
        int i  = 0, j = matrix[0].length-1;
        while(i>=0 && j>=0 && i < matrix.length && j<matrix[0].length){
            if(matrix[i][j]==target){                   // return the true boolean
                return true;
            } else
            if(matrix[i][j] > target){                  // If the element is greater than the target, move to the left by j--
                j--;
            } else {
                i++;                                    // Move downwards by i++ to get the element
            }
        }
            return false;                               // Not found
        }
}