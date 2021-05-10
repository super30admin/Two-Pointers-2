//brute force- o(mlogn) or o(nlogm), binary search at every level

//Time- o(m+n)
//Space- o(1)
//passed in leetcode- yes
//issues faced? - no

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge cases
        if(matrix==null || matrix.length==0) return false;
        //if(mat)
        int m=matrix.length; // no of rows
        int n= matrix[0].length; //no of columns
        int i=0;
        int j=n-1;
        while(i<m && j>=0)// i and j pointers must be within bounds
        {
            if(matrix[i][j]>target)
            {
                j--;
            }
            else if(matrix[i][j]<target)
            {
                i++;
            }
            else if(matrix[i][j]==target)
            {
                return true;
            }
        }
        return false;
        
    }
}