package TwoPointers2;

public class question38_serach2DMatrix2 {
    /*
        Brute Force:
            Time Complexity: O(n ^ 2)
            Space Complexity: O(1)
    */
    public static boolean searchMatrixBruteForce(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length ; i++) {
            for(int j = 0 ; j < matrix[0].length ; j++) {
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }

    /*
        Binary Search:
            Time Complexity: O(n + m)
            Space Complexity: O(1)
    */
    public static boolean searchMatrixTwoPointer(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n - 1;

        while(i < m && j >= 0) {
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] <= target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        searchMatrixBruteForce(matrix, target);
        searchMatrixTwoPointer(matrix, target);
    }
}