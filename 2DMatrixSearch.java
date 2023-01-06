// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We know the rows are sorted left to right and columns top to bottom
// For the element at the top right(or vice versa for bottom left), elements towards left are in decreasing order and elements to the bottom are in increasing order
// So we search by moving the column pointer down by 1 if element is greater than target else move the row pointer to the left by 1

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int i=0, j = m-1;
        while(j>=0 && i<n){
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]<target)
                i++;
            else
                j--;
        }
        return false;
    }
}