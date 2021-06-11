

//Time Complexity - O(n+m)
//Space Complexity - O(1)


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // define the pointers to the bottom left of the matrix

        int row = matrix.length - 1;
        int column = 0;

        // break while loop if conditions not met which moves the pointers out of matrix
        while(row >= 0 && column < matrix[0].length) {


            // if the element is more then the target decrement the row
            if(matrix[row][column] > target) {

                row--;

            }

            // if the element is less the the target increment the column position
            else if(matrix[row][column] < target) {

                column++;

            }
            else {

                return true;

            }


        }

        return false;


    }
}