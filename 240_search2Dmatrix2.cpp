// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty() || matrix.size() == 0){
            return false;
            
        }
        int m = matrix.size();
        int n = matrix[0].size();
        int i=m-1, j=0;
        while(i>=0 && j<n){
            if(target == matrix[i][j])
                return true;
            else if(target < matrix[i][j] )
                i--;
            else
                j++;
        }
        return false;
    }
};
