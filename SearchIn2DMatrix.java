// Time Complexity : O(M+N), in the worst case, we will traverse the rows and cols in step form,
// move left, move down, so m rows down, n cols left
// Space Complexity : O(1), in place search
// Did this code successfully run on Leetcode : Yes
// Approach :

// Brute force - search linearly every cell.
// Optimal - Find a cell which can divide your search space by half (top right corner or bottom left corner)
// From that cell, compare the target, if the target is greater move to the next row as it is sorted and search in that row.
// If the target is smaller, move to prev col and search on the left.
public class SearchIn2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1 && cols == 1){
            return matrix[0][0] == target;
        }
        // Search from top left corner
        int startRow = 0;
        int startCol = cols-1;


        while(startRow <= rows-1 && startCol >= 0 ){
            if(target == matrix[startRow][startCol]) return true;
            // if target is greater, search in next row as values are sorted by row
            if(target > matrix[startRow][startCol]){
                startRow++;
            }else {
                // if target is smaller, search on prev col as values are sorted by col too.
                startCol--;
            }
        }
        return false;
    }
}
