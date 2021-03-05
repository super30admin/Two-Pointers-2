//Time complexity: O(m+n)
//Space complexity: O(1)
//Executed on leetcode.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length-1, n = matrix[0].length-1;
        int r=m, c = 0;
        
        while(r>=0 && c<=n)
        {
            if(matrix[r][c]==target) //Taken a pointer at left bottom corner of the matrix.
                return true;
            else if(matrix[r][c]<target)    //As given all the rows and columns are sorted respectively.
                c++;                        //If target is bigger than the value at index, going through the column to right.
            else
                r--;               //if target less traversing through row towards up.
        }
        
        return false;
    }
}