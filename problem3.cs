public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].Length-1;
        while(c>=0&&r<=matrix.Length-1)
        {
            if(matrix[r][c]==target)
            {
                return true;
            }
            else if(matrix[r][c]>target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return false;
    }
}