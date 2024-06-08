// Time Complexity : O(m+n) where m,n is size of matrix, worst case we traverse from bottom row left col
//                   top row right most col, which ends up in TC of m+n
// Space Complexity : O(1) no extra space apart from couple of variables 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int tot_rows = matrix.size();
        int tot_cols = matrix[0].size();
        int row = tot_rows-1;
        int col = 0;
        while(row>=0 && col<tot_cols)
        {
            if(matrix[row][col]== target)
                return true;
            
            else if(matrix[row][col] > target)
                row--;

            else
                col++;
        }
        return false;
    }
};