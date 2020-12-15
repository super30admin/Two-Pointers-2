// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty()){
            return false;
        }
        int m = matrix.size();
        int n = matrix[0].size();
        
        int i=0, j=n-1;
        
        while(i<m && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(target>matrix[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
};
