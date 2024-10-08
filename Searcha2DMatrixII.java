
// Did this code successfully run on Leetcode :yes


//brute force nested 2 loops and check for target TC-O(nm) SC-O(1)
//binary search at each row nlogm

//optimized approach- TC- m+n check from 1 corner and start eleminating rows if target is bigger or start eliminating
// column if if target is lesser than current until we find the element



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0, c = n-1;

        while(r <= m-1 && c >= 0 ){
         if(matrix[r][c] == target){
            return true;
         }
         else if(matrix[r][c] > target){
            c--;
         } else{
            r++;
         }

        }


      return false;
        
    }
}
