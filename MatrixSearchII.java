/* Time complexity: O(m+n)
 * Space Complexity: O(1) no extra space needed
 * leetcode: yes
 * Any Issues: no
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;

        while(i<m && j>=0)
        {
            if(matrix[i][j] == target)
                return true;
            if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }

    
}
