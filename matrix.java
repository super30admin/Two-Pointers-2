
// Time Complexity : O(r+c)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int r = matrix.length;
            int c = matrix[0].length;
            int i=0, j=c-1;
           
            while(i<=r-1&&j>=0){
                int val = matrix[i][j];
                if(val == target)
                    return true;
                else if(matrix[i][j]>target){
                    j--;
                }
                else if(matrix[i][j]<target){
                    i++;
                }
               
            }
             return false;
        }
    }

