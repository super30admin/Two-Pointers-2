// This solution uses a search from top-right corner approach, moving down if the target is greater and left if smaller, efficiently narrowing the search space. 
//   The time complexity is O(m + n) because in the worst case, you move at most m steps down and n steps left. 
//   The space complexity is O(1) since it only uses a few variables.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r=0;
        int c=n-1;
        while(r < m && c > -1){
            if(matrix[r][c] == target)
                return true;
            else if(target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}
