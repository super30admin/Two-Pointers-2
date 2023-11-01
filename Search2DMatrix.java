//Time complexity : O(m+n)
//Space complexity : O(1)

//we start from either right top corner or left bottom corner
//we move from column to column or row to row depending on where we are in the matrix


public class Search2DMatrix {

    public static void main(String[] args)
    {
        int nums[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean result = searchMatrix(nums, 5);
        System.out.println("Target found: " + result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;

        while(i < m && j>=0)
        {
            if(matrix[i][j] == target) return true;
            else if (matrix[i][j] > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}