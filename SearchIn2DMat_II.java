//Leetcode: 240 https://leetcode.com/problems/search-a-2d-matrix-ii/description/
//Time Complexity = O(m+n) //m rows, n columns
//Space Complexity = O(1) //No Auxiliary Spae
// Does it run on LeetCode successfully? : Yes
// Any difficulties: Not as such. Just need to practice the logic

/*
Start from Top right and if target is greater than that number then come left ; smaller then come down
(Constraint: You can't go up and right here ^^)
Start from bottom left and if target is greater than that number then come right; smaller then come up
(Constraint: You can't go down and left here ^^)
 */

public class SearchIn2DMat_II {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length ==0) return false;
        int m = matrix.length; //no of rows
        int n = matrix[0].length; //no of columns
        int i =0; int j = n-1;

        //Top Right
        while(i<m && j>=0){
            if(matrix[i][j] == target) {
                return true;
            }else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        int i =m-1; int j = 0;
        //Bottom Left
        while(i>0 && j<n){
            if(matrix[i][j] == target) {
                return true;
            }else if(matrix[i][j] > target){
                i--;
            }else{
                j++;
            }
        }

        return false;

    }

    public static void main(String[] args){
        SearchIn2DMat_II obj = new SearchIn2DMat_II();
        obj.searchMatrix(new int[][] { {1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24} }, 5);
    }
}