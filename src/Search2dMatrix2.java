// Time Complexity:           O(m+n)
// Space Complexity:          O(1)
// where m is number of rows of array, n is number of columns of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

public class Search2dMatrix2 {
    public static void main(String[] args) {
        int[][] nums = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int t = 5;
        Search2dMatrix2 sm = new Search2dMatrix2();
        System.out.println(sm.searchMatrix(nums, t));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n-1;

        while(i<=m-1 && j>=0)                                               // first column, last row will be edge case
        {
            if(matrix[i][j] < target)                                       // target is greater
            {
                i++;                                                        // then move down
            }
            else if(matrix[i][j] > target)                                  // target is less
            {
                j--;                                                        // then move left
            }
            else                                                            // got the target
                return true;
        }
        return false;
    }
}
