// Time Complexity : O(m + n) where m = rows and n = columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Search in 2-D Matrix

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int row = 0;
        int col = matrix[0].size() - 1;
        
        while(row < matrix.size() && col >= 0){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                col--;
            else
                row++;
        }
        
        return false;
    }
};