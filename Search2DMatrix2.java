// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Start from the top-right corner of the matrix.
// If the current element is greater than target, move left; if smaller, move down.
// Continue until you find the target or go out of bounds.



public class Search2DMatrix2 {
    public boolean solve(int[][] matrix, int target){
        if(matrix==null || matrix.length==0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n-1;

        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }

            if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return false;

    }
    public static void main(String[]args){
        Search2DMatrix2 ob = new Search2DMatrix2();
        int[][] matrix = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        System.out.println(ob.solve(matrix, 5));
        System.out.println(ob.solve(matrix, 15));

    }
    
}
