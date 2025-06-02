/*
  Time complexity: O(m+n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

  Approach: The iterations start from top-right and move down if the target is greater than the current element and left if it is greater.

*/

public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        int i = 0;

        int j = n -1;

        while(i < m && j >=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }

        return false;
    }
}
