// Time Complexity : O(n+m)
//      n: row length
//      m: col length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// We know that for a sorted array as you go right elements increases and left elements decreases.
// Since it is a sorted matrix, we need a direction to search.
// Thus we need tp find co-ordinates where we can reduce the number of decision.
// (reduce the search space)
// (For matrix special co-ordinates are the corner and diagnol elements)
// These co-ordinates are the corners -> top-left, top-right, botton-left, bottom-right.
// For top-left both directions are increasing and bottom-right both are decreasing
// So now we can chose either top-right or botton-left.
// In our problem we chose top-right.
// Element to left are decreasing order and right are increasing order reducing the search space.
class Problem2 {

    /** find the traget in sorted matrix */
    public boolean searchMatrix(int[][] matrix, int target) {
        // edge case
        if(matrix.length==0)
            return false;

        // start with corner
        int row= 0;
        int col = matrix[row].length-1;

        while(row< matrix.length && col>= 0){

            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                col--;
            else
                row++;
        }
    
        return false;
        
    }
}