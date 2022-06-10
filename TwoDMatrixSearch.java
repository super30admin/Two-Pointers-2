// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
/*
 * We can choose one corner out of the two - the upper right corner or the lower left corner.
 * We will then compare the element at that index with the target and increment row and column pointers accordingly.
 */
// Your code here along with comments explaining your approach

public class TwoDMatrixSearch {

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix, 20));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        if(matrix == null || matrix.length == 0)
        {
            return false;
        }
        
        int i = 0; int j = n - 1;
        
        while(i < m && j >= 0)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }
            else if(matrix[i][j] < target){
                i++;            
            }
            else
            {
                j--;
            }
        }
        return false;
    }    
}
