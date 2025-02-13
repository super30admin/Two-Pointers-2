// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        int r = m-1;
        int c = 0;
        while (r >=0 && c < n) {
            if (matrix[r][c] == target) return true;
            if (matrix[r][c] > target) r--;
            else c++;

        }
        return false;
    }
};