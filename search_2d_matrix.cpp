// Time Complexity : O(m*n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Time performance can be better; Will refere the lecture solution

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int ptr = 0;
        int i;
        
        int m = matrix.size();
        int n = matrix[0].size();
        
        // Find the first possible row for the target
        for(i = 0; i < m; i++)
        {
            if(target >= matrix[i][0] && target <= matrix[i][n-1])
            {
                break;
            }
        }
        
        // Linear search currently,
        // Can substitute with Binary search for better performance
        for(; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] == target)
                    return true;
            }
        }
        
        return false;
        
    }
};