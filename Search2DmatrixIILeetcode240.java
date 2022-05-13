//Time Complexity: O(m + n)
//Space Complexity: O(1)
//Leetcode: Yes
public class Search2DmatrixIILeetcode240 {
        public boolean searchMatrix(int[][] matrix, int target) {
            //base case
            if (matrix == null || matrix[0].length == 0) {
                return false;
            }

            int r = matrix.length;
            int c = matrix[0].length;
            int i = 0, j = c-1;     //starting from top right we cna also start from bottom left as those are the only two positions where we can make a definitve decision to move in a particular direction
            while (i < r && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    //num is bigger than target so go to left
                    j--;
                } else {
                    //num is smaller than target so go down
                    i++;
                }
            }
            return false;
        }

}
