// Sc = 0(1)
// Tc = 0(m+n)
public class TwodMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        int target = 5;
        TwodMatrix obj = new TwodMatrix();
       // obj.matrix(arr, target);
        System.out.println("print the target =" + obj.matrix(arr, target));
    }

    public boolean matrix(int[][] matrix, int target) {

        // null case
        if (matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;

    }
}