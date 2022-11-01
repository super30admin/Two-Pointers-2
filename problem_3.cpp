/ Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        
        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            int mid = matrix[row][col];
            if (target == mid) return true;
            else if (target < mid) {
                //eliminate column
                col--;
            } else {
                //eliminate row
                row++;
            }
        }
        return false;
    }
};
