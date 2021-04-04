// Time Complexity : O(m+n)
// Space Complexity : Constant
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//taking two pointer approach Traverse the array starting from first row and last column
//hence first pointer is i for the row and j for the column. If the element is greater than target, decrease
//row(i--) otherwise increase column, else we found the target

// Your code here along with comments explaining your approach
public class Problem3 {
    public static void main(String[] args){
        int matrix[][] = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 20;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int i=m;
        int j=0;
        //check the last element of each row
        while(i>=0 && j<=n){
            if(target < matrix[i][j]){
            i--;
            }else if(target > matrix[i][j]){
            j++;
            }else{
            return true;
        }
        }
        return false;
    }
    
}
