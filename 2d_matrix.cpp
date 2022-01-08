// Time Complexity : O(m+n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int m=matrix.size()-1;
        int n=matrix[0].size()-1;  
        int i = 0;
        int j = n;
        
        while(i<=m && j >=0){
            if(target == matrix[i][j]){
                return true;
            }
            else if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
        
    }
};

