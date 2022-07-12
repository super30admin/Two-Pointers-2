//Time Complexity: O(m + n), where m is the no. of rows & n is the no. of columns.
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem3 {

    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null|| matrix.length == 0)
            return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        //starting at top right
        int r = 0;
        int c = n-1;
        
        while(r < m && c >= 0){
            
            if(matrix[r][c] == target)
                return true;
            
            else if( matrix[r][c] < target)
                r++;
            
            else
                c--;
        }
        return false;
    }
}
