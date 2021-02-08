// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//We are starting from right most coloumn from the first row and if target is equal we are returning true
//or will check if target is greater than that element then we are increasing the row
// else we will decrease the coloumn
// Your code here along with comments explaining your approach

public class Search2Dmatrix {
    
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix==null ||matrix.length==0||matrix[0].length==0){
                return false;
            }
            
            int n = matrix.length-1;
            int m = matrix[0].length-1;
            
            int i=0;
            int j=m;
            
            while(i<=n&& j>=0){
                
                if(matrix[i][j]==target){
                    return true;
                }else if(matrix[i][j]<target){
                    i++;
                }else {
                    j--;
                }
            }
            return false;
            
        }
    
}
