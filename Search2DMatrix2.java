// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Approach: In this approach we take the last element of the first row as a pivot and we go in the direction
//that we can find our target. If the pivot is greater then we go previous columns. Or i
//if it is smaller we go in the next rows. If we go out of bound and still don't find it we return false.
public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length ==0)return false;

        int m=matrix.length; int n = matrix[0].length;
        int i = 0; int j=n-1;
        while(i <m && j>=0){
            if(matrix[i][j] == target)return true;
            else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
