public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int i = 0;
        int j = n;
        while (i <= m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target) {
                j--;
            } else
                i++;
        }
        return false;
    }
    public static void main(String args[])
    {
        int k = 45;
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Search2DMatrix2 ob = new Search2DMatrix2();
        System.out.println(ob.searchMatrix(matrix,k));
    }
}
//time complexity is O(m+n)
//space complexity is O(1)