/*
Time Complexity: O(m+n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(), n = matrix[0].size();
        int mid, ri = 0, ci=n-1;
        while(ci>=0 && ri<m){
            mid = matrix[ri][ci];
            if(mid==target){
                return true;
            } else if(mid>target){
                ci--;
            } else {
                ri++;
            } 
        }
        return false;
    }
};
