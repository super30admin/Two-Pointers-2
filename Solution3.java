// Time Complexity :O(m+n)m=no of rows, n=no of columns
// Space Complexity :O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since the rows are sorted as well as the column, using 2 pointer approach
//This will define sure shot way to move ina direction where target can be found
// Your code here along with comments explaining your approach
public class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null|| matrix.length==0)
            return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int i=m-1;
        int j=0;
        // used two pointers , starting from bottom left corner
        while(i>=0 && j<n){
            
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                i--;
            }
            else
                j++;
        }
      return false;    
}
