//Time complexity : O( m + n)
//Space complexity : O(1)

// Approach:
            // Start with right top corner
            // Go down if the target is bigger than current element
            // Go left if the target is smaller than current element
            // If found then return true
            // If row, column cross the boundaries then return false

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size() == 0)
            return false;
        
        int m = matrix.size();
        int n = matrix[0].size();
        
        int i = 0;
        int j = n - 1;
        
        while(i < m && j >= 0)
        {
            if(matrix[i][j] == target)
            {
                return true;
            }
            
            else if(matrix[i][j] > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        
        return false;
    }
};