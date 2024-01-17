// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// iterates through each row and checks if the target falls within the range of values in that row.
// If the target is within the range, it performs a linear search
public class problem3 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix[0][0] > target || matrix[matrix.length-1][matrix[0].length-1] < target)
            return false;

        for(int i = 0; i < matrix.length; i++)
        {
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1])
            {
                for(int k = 0; k <= matrix[i].length - 1; k++)
                {
                    if(target == matrix[i][k]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
