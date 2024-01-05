/*
 ? Problem: Search a 2D Matrix 2
 * Time Complexity : O(n + m)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

#include <vector>

class Solution {
public:
    bool searchMatrix(std::vector<std::vector<int>>& matrix, int target) {
        int n = matrix.size() - 1;

        int i = 0, j = matrix[0].size() - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
};