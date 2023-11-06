
// Time Complexity :  O(m+n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  Yes

// Start from top right or bottom left.
// Suppose we are at i,j the paths [i,0]-->[i,j]-->[m-1,j] and [0,j]-->[i,j]-->[i,n-1] both will be sorted.
// so if [i,j]<target we will move down because we know numbers to left of [i,j] are lesser so we will not find it to left so go to next row.
// similarly if [i,j]>target, we will not find below because all are greater than [i,j]
// if found return;
// We are just eliminating the cases where we will definitely not find the number


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int i=0, j=n-1;

        while(j>=0 && i<m){
            if(matrix[i][j]<target){
                i++;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}