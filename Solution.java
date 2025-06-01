//T.C: O(m+n) m: no of rows, n: no of cols
//S.c: O(1) No extra data structure is used except few variables to store my pointers which is constant.

/*Approach:  Start searching from left-bottom corner and each time i encounter a number > target i will reduce the row else increase the col. 
*/
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i =  matrix.length - 1;
        int j = 0;

        while(i >= 0 && j <  matrix[0].length){

            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target){
                i--;
            }else{
                j++;
            }
        }
     return false;   
    }
} {
    
}
