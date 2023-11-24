// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class Problem3 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        
        int x = 0;
        int y = n-1;
        
        while(x < m && y>=0){
            if(matrix[x][y] == target) return true;
            if(matrix[x][y] > target){
                y--;
            }else{
                x++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };

        int target1 = 5;
        int target2 = 20;

        boolean result1 = searchMatrix(matrix, target1);
        boolean result2 = searchMatrix(matrix, target2);

        System.out.println("Does the matrix contain " + target1 + "? " + result1);
        System.out.println("Does the matrix contain " + target2 + "? " + result2);
    }
}
