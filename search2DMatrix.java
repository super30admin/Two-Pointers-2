//time complexity: O(m*n) where m is the number of rows and n is the number of columns inside the matrix
//space complexity : O(1)
//executed on leetcode: yes
//approach : we start searching at the top right corner element
//if the element we are at is equal to the target , we return true
// if element we are at is greater then target, we need to reduce search space by bringing down the column value, coz elements to the right of the column will be greater than target anyways
//if element we are at less than target, we need to increment the row value because elements to the left of the present column value will be less than the target anyways

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int j = matrix[0].length-1;
        int i=0;
        while(j>=0 && i<matrix.length)
        {
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) j--;
            else i++;
        }
        return false;
    }

}