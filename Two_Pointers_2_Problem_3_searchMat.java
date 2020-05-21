//Time complexity : O(m+n) where m = number of rows n = number of columns
//Space complexity : O(1)
//Runs successfully on leetcode
//No problem

//Here we'll be starting our search on two ends of the diagonals
//If we're starting on top right point, if number is greater than target - we'll be decreasing the column
//similarly if the number is lesser than the target, we'll be increasing row
//eventually we'll reach at our target number


public class Two_Pointers_2_Problem_3_searchMat {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = n-1;

        while(r < m   && c >= 0)
        {
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] < target) r++;
            else c--;
        }
        return false;
    }
}
