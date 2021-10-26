// 240 Search a 2D Matrix II
// solved on leetcode
// time complexity O(m+n)
// Space complexity O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowEnd=matrix.length-1;
        int colEnd=matrix[0].length-1;
        int i=0,j=colEnd;
        int flag=1;
        while(i<=rowEnd && j>=0 && (flag ==1)){
            if(matrix[i][j]==target){
                return true;
            }
            flag=0;
            while(j>=0 && matrix[i][j]>target){        
                j--;
                flag=1;
            }
            while(j>=0 && i<=rowEnd && matrix[i][j]<target && matrix[i][j]!=target ){
                i++;
                flag=1;
            }
            
            
        }
        return false;
    }
}