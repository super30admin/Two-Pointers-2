// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//  Use two pointers. Start with the last row first element
// Reduce the row if the element is greater than target
// Increase the column the if the element is smaller than target
// Return true if number is found
class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
      if (matrix == null || matrix.length ==0 || matrix[0].length==0) return false;
        
        int ptr1 = matrix.length -1;
        int ptr2 = 0;
        
        while (ptr1 >=0 && ptr2 <=matrix[0].length -1 ) {
            if (matrix[ptr1][ptr2] == target) {
                return true;
            }
            
            else if (matrix[ptr1][ptr2] > target) {
                ptr1--;
            }
            else {
                ptr2 ++;
            }
        }
        
        return false;
    }
}