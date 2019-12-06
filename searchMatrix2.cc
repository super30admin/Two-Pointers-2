// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : It ran successfully
// Any problem you faced while coding this : None

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row_ptr = matrix.size()-1;
        int col_ptr = 0;
        if(matrix.size() == 0 || matrix[0].size()==0){
            return false;
        }
        while(row_ptr >= 0 && col_ptr <= matrix[0].size()-1){
            if(matrix[row_ptr][col_ptr] == target){
                return true;
            }
            else if(matrix[row_ptr][col_ptr] > target){
                row_ptr--;
            }
            else{
                col_ptr++;
            }
        }
        return false;
    }
};