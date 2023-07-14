// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if (matrix.empty())
            return false;

        int m = matrix.size();
        int n = matrix[0].size();

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }

        return false;
    }
};
