// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class Searchatrix {
public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row <= matrix.length - 1 && col >=0){
            int mid = matrix[row][col];

            if (target == mid){
                return true;
            }
            if (target > mid){
                row++;
            }
            else{
                col--;
            }
        }

        return false;
    }

    public static void main(String [] args){
    int [][] num = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

     Searchatrix obj = new Searchatrix();
     obj.searchMatrix(num, 5);
    }
}