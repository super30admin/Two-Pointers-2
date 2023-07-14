//Search a 2D Matrix II
//Time Complexity->O(m+n)
//Space Complexity->O(1)
class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {

        //we can have top right or bottom left position to begin our searching
        //for top right->row element in increasing and cols in decresing order...so we can get small/large element easily
        int i=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int j=n-1;
        while(i<m && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]<target)
            {
                i++;
            }
            else if(matrix[i][j]>target)
            {
                j--;
            }
        }
        return false;
    }
} 