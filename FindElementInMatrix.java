package Day14;
//TC: O(m+n) SC:O(1)
/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
 */

public class FindElementInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Edge case
        if(matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        //considering starting matrix element from bottom left corner

       /* int i = m-1;
        int j = 0;

        while(i>=0 && j<n){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target){ i--; }
            else {j++;}
        }*/

        //considering starting matrix element from top right corner

        int i = 0;
        int j = n-1;

        //making sure i and j lie within matrix
        while(i<n && j>=0) {
            //if considered matrix element is target return true;
            //this would also be the stopping condition for the loop to break anytime inbetween before i and j cross matrix I mean
            if (matrix[i][j] == target) return true;

            //if matrix element is lesser than target then, target wont lie in that sorted row so go to next row along the same column
            else if (matrix[i][j] < target) {
                i++;
            }

            //if matrix element in greater than the target, there are chances that target might exist in that row; so move along the row by changing j either till j's element is
            //lesser or you find the target or get out of the loop :P
            else {
                j--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        FindElementInMatrix obj = new FindElementInMatrix();

        int[][] matrix = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};

        System.out.println("The target if found in matrix: "+ obj.searchMatrix(matrix, 390));
    }
}