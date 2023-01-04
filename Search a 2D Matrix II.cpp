// TC = O(m + n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        // null
        if(matrix.size() == 0) return false;
        int m = matrix.size(), n = matrix[0].size();
        int i = 0, j = n - 1;
        // staircase algo starting from top right corner
        while(i < m && j >= 0) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
};