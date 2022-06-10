// Time complexity=O(n)
//Space complexity=O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length==0) return false;
        int i=0;
        int j=matrix[i].length-1;
            while(j>=0 && i<matrix.length){
                if(matrix[i][j]==target) return true;
                if(matrix[i][j]<=target) {
                    i++;
                 j=matrix[0].length-1;
                }
                else j--;
            }
        return false;
        }
    }
