//Time Complexity : O(m+n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        //declare the two pointers
        int i=0, j=col-1;
        
        while(i>=0 && j<col && i<row && j>=0){
            //can operate from either rightmost top corner or leftmost bottom corner as the other two corners have either both small or both large values from the mid element
            int mid = matrix[i][j];
            if(mid==target){
                return true;
            }
            //move left
            if(target < mid){
                j--;
            }
            //move right
            else{
                i++;
            }
        }
        return false;
        
        
    }
}