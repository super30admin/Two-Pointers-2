// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class SearchMatrix {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length-1;
            //int n = matrix[0].length-1;
    
            int r = 0;
            int c = matrix[0].length-1;
    
            while (r <= m && c >= 0){
                if (matrix[r][c] == target){
                    return true;
                } else if (target > matrix[r][c]){
                    r++; 
                } else {
                    c--;
                }
            }
            return false;
        }
    }