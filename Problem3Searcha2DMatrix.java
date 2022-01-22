//TC: O(M+N) //as at max one will be travelling the entire row and entire column to search in the given 2-D Matrix;
//SC: O(1) and not array/ extra space needed to find the element

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        
        int i=0,j=n-1;
        //the boundaries of left most extreme to be checked;
        //for the loop to not go out of bounds as staring from initial of rightmost top element;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
