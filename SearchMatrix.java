// Overall Time Complexity : O(m+n) . The m represents number of rows and n represents number of columns.
// Overall Space Complexity : O(1) . There no extra space taken in the problem.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// This solution involves finding the target element in the matrix. 
// Start iterating from top-right of the matrix and compare it with the target. (top-right element is the highest element in the row and the least in that particular column)
// Check if the current element is greater than the target then move left .
// Else move down to target . 

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {


        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;

        while(j>=0 && i<m){
            if (matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
    }
}

