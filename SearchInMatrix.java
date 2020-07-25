//Time Complexity : O(m+n) m rows n columns
//Space Complexity : O(1)
/*Approach 
-starting from top right corner and deciding on which direction to go based on target
-if target is less we will go left in the column and if target is greater we will go
down in the row since both rows and columns are sorted
*/
public class SearchInMatrix{
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
        {
            return false;
        }
        
        int col = matrix[0].length -1;
        int row = 0;
        
        while(col >= 0 &&  row < matrix.length)
        {
            if(target == matrix[row][col])
            {
                return true;
            }
            
            else if( target < matrix[row][col])
            {
                col = col - 1;
            }
            else
            {
                row = row + 1;
            }
        }
        
        return false;
    }
    public static void main(String args[]){
        System.out.println(searchMatrix( new int[][]{ 
        {1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}}
      , 17));

      System.out.println(searchMatrix( new int[][]{ 
        {1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}}
      , 35));

    }
}