// Time Complexity : O(M+N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Using the two pointer method, and taking advantage of the sorted order
// keep decrementing column vise or incrementing row wise.

// 240. Search a 2D Matrix II

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        int i = 0,j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
};

