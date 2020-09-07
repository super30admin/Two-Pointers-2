// Time Complexity : O(M+N) M-rows, N-col in a matrix
// Space Complexity : O(1) constant space or our space not dependent on input length. We use extra space by declaring variables.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//We are following a method of reducing search space of matrix.
//Start from top right corner, because it has decreasing values on one side and increasing on the other.
//If target is > cur value, increment row. Else decrement col. This reduces search space.

public class Search2DArray {
    
    public static boolean searchArray(int[][] matrix, int target){

        int r = 0, c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,6,10},{3,9,13},{5,11,15}};
        System.out.println(searchArray(matrix, 2));
    }

}
