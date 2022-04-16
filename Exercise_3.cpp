// Time Complexity                              :  O(N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  


// https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int n = matrix.size();
        int m = matrix[0].size();
        if(n == 0) return false;
        int i=n-1;int j=0;
        
        while(i>=0 and i<n and j>=0 and j<m) {
            if(target == matrix[i][j]) return true;
            else if (target > matrix[i][j]) {
                j++;
            } else {
                i--;
            }
        }
        
        return false;
        
    }
};