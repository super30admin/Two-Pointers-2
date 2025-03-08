public class problem3 {
    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int r=0, c=n-1;
        while (r<m && c>=0)
        {
            if(matrix[r][c]==target)
            {
                return true;
            }
            else if(matrix[r][c]> target)
            {
                c--;
            }
            else {r++;}
        }
        return false;
    }

}
