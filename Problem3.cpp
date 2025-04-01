// Time Complexity : O(N) + O(M) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Start pointer from top right or bottom left corner.
// 2. If compare with target and move direction accordingly. 


class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n=matrix.size(),m=matrix[0].size();
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(target<matrix[i][j]){
                j--;
            }else if(target>matrix[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
};