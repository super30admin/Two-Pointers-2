/*
Search in a 2d matrix ii
start from top right corner so that you have the option to go left or down, if target<element go left else go down

time: O(m+n)
space: O(1)
 */

public class Problem3 {
    static boolean searchMatrix(int[][] matrix, int target) {

        int row=0,col=matrix[0].length-1;


        while(row<matrix.length && col>=0) {
            if(matrix[row][col]==target) return true;

            if(matrix[row][col]<target) row++;
            else col--;
        }
        return false;
    }
    public static void main(String []args){
        searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5);
    }
}
