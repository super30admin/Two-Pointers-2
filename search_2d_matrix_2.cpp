/*
 * @Author: Yuvaraj Nagi
 * @Date: 2022-11-23 22:08:08
 * @Last Modified by: Yuvaraj Nagi
 * @Last Modified time: 2022-11-23 22:08:40
 * Time complexity : O(n)
 * Space Complexity : O(1)
 */

class Solution
{
public:
    bool searchMatrix(vector<vector<int>> &matrix, int target)
    {
        // rows and columns need to be stored in integers m and n

        int m = matrix.size() - 1;
        int n = matrix[0].size() - 1;

        // start traversing from top right matrix[0][n]
        int r = 0;
        int c = n;
        while (r <= m && c >= 0)
        {
            if (matrix[r][c] == target)
            {
                return true;
            }

            else if (matrix[r][c] > target)
            {
                c--;
            }

            else
            {
                r++;
            }
        }
        return false;
    }
};