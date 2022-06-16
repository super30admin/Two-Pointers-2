// Time Complexity - O(m+n), Since in the worst case we might have to traverse all 'm' rows and all 'n' columns to reach our target element.
// Space Complexity - O(1), since no extra space is needed for this solution.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        int i = 0;
        int j = n - 1;
        
        while(i < m && j >= 0){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
};
