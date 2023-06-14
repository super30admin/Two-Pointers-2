
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english 
/* Start from rightmost column and move the pointer to left if the target is less and downwards if the target is more.
 * 
 */

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //base case
        if(matrix.length == 0 || matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        //start from rightmost column [row 0 , column n -1]
        int r = 0, c = n-1;
        System.out.println(matrix[r][c]);
        while(r<m && c >= 0){
       
             if(target> matrix[r][c]){
                 r++;
            }
            else if(target< matrix[r][c]){
                c--;

            }
            else{
                return true;
            }
        }
        return false;
        
    }
}


// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english 
/*This approach is similar to above approcah and you start from bottom left and move in upward and right direction.
 * 
 */

// Your code here along with comments explaining your approach


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //base case
        if(matrix.length == 0 || matrix == null) return false;
        int m = matrix.length, n = matrix[0].length;
        //start from bottomleft [row : m-1, col :0 ]
        int r = m-1, c = 0;
        while(r>=0 && c <n){
       
             if(target> matrix[r][c]){
                c++;
            }
            else if(target< matrix[r][c]){
                r--;

            }
            else{
                return true;
            }
        }
        return false;
        
    }
}