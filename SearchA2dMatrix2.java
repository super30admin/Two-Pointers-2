/**
 * two pointers
 * https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/
 * 
 * time: O(m+n)
 * space: O(1)
 * 
 * Leetcode: Yes
 * 
 * Approach:
 * We cannot start from the top left most or bottom right most
 * because the numbers are increasing on both the sides, thus a decision cannot be made
 * 1 < 4
 * ^
 * 2 
 *
 * or because the numbers are decreasing on both the sides:
 * 
 *     24
 *      ^
 * 26 < 30
 * 
 * Either use top right most to start
 * because numbers are decreasing towards the left and increasing towards bottom
 * and a decision can be made
 * 
 * 11 < 15
 *      ^  
 *      19 
 * 
 * or use bottom left most element to start
 * because numbers are increasing towards the right and decreasing towards top
 * 
 * 10
 * ^
 * 18 < 21 
 * 
 * use top right most to start:
 * 1. compare the element with target 
 * 2. if equal return true
 *    if lesser than target then move left 
 *    if greater than target then move down
 * 3. repeat till the row and column dont reach out of bound
 *    and return false if equal element not found
 * 
 */
class SearchA2dMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // start from top right corner
        int r = 0;
        int c = n-1;
        
        while(r < m && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }            
        }
        return false;
    }
}