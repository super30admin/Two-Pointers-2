//Time Complexity: O(m+n) //m = number of rows, n= number of columns
//Space Complexity: O(1)
//didn't face any problems
//runs successfully


public class SearchA2DMatrix2LeetCode {


        public boolean searchMatrix(int[][] matrix, int target) {

            int m = matrix.length;                              //total row
            int n = matrix[0].length;                           //total column

            int row = 0;                                        //row
            int column = n - 1;                                   //column

            while (row < m && column >= 0) {                          //check is row and column pointer are between array boundries

                if (matrix[row][column] == target) {                //check the upper right edge element is target or not
                    return true;                                //if yes, then return true
                } else if (matrix[row][column] < target) {            //if not, then check if target is greater than this element
                    row++;                                      //if so, then increment the row pointer
                } else {                                           //if not then decrement the column pointer
                    column--;
                }
            }
            return false;                                       //it means element is not present in the array so return false

        }
}
