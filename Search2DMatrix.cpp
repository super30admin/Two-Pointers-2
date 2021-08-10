// Time Complexity : O(M+N) where M is the number of rows and N is the number of columns
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
// Submission Link: https://leetcode.com/submissions/detail/536391084/

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int cur_row = matrix.size() - 1, cur_column = 0;
        int column_size = matrix[0].size();
        
        while(cur_row >= 0 && cur_column < column_size){
            if(target == matrix[cur_row][cur_column])
                return true;
            else if(target > matrix[cur_row][cur_column])
                cur_column++;
            else
                cur_row--;
        }
        
        return false;
    }
};