// Time Complexity:  O(n)
// Space Complexity: O(1)

package leetcode;

public class Fanng38 {

    public boolean searchMatrix(int[][] matrix, int target){
        int r=0;int c=matrix[0].length-1;
        while(c>=0 && r<matrix.length){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
