
// Time Complexity : O(n + m) where m = no. of rows , n = no. of cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*

We start from lower left point in matrix,
if the target is greater than the current element, we move right,
else we move left.
This is done since the elements in each row are in non-decreasing order
and the same property is scene in columns as well.

*/

public class SearchATwoDMatrixII {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        
        if(matrix == null || matrix.length == 0)
        {
            return false;
        }
        
        int m = matrix.length; // row
        int n = matrix[0].length; // column
        
        int i=m-1,j=0; //lower left
        
        while(i>=0 && j<n)
        {
            int current = matrix[i][j];
            
            if(current == target)
            {
                return true;
            }
            
            if(target>current)
            {
                j++;
            }
            else
            {
                i--;
            }
        }
        
        return false;
    }

    public static void main(String args[])
    {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}
