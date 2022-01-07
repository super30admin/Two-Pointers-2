/*
TIME COMPLEXITY : O(m+n) where m is the number of rows and n is col
SPACE COMPLEXITY : O(1)
DID THIS CODE SUCCESSFULLY RUN ON LEETCODE : Yes
THREE LINE EXPLANATION OF SOLUTION IN PLAIN ENGLISH

I compare with last element to keep going to a matching row and then increment
my low pointer and decrment my high pointer acc to the value, if found return
else increase the row. If it is less than first element of next row not found.
return false


YOUR CODE HERE ALONG WITH COMMENTS EXPLAINING YOUR APPROACH


*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix[0].length -1;

        int row = 0;
        int col = 0;


        while(row < matrix.length){
            low = 0;
            high = matrix[0].length -1;


            while(row < matrix.length && target > matrix[row][high]){
                row++;
            }

            if(row >= matrix.length)
                return false;

            if(target < matrix[row][low]) return false;
            else if(target == matrix[row][low] ||
                   target == matrix[row][high]) return true;

            while(low <= high){
                if(target > matrix[row][low]){
                    low++;
                }
                else if(target < matrix[row][high]){
                    high--;
                }
                if(target == matrix[row][low] ||
                   target == matrix[row][high]) return true;
            }

            row++;

        }

        return false;
    }
}
