// Time Complexity : o(n x m)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& mat, int target) {
        int n=mat.size();
        int m=mat[0].size();
        int row=0,col=m-1;
        while(row<n && col>=0) {
            if(mat[row][col]==target) {
                return true;
            } else if(mat[row][col]>target) {
                col--;
            } else {
                row++;
            }
        }
        
        return false;
    }
};