// Time Complexity :O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// we use stair case approach ( using two pointer approach)

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.empty() || matrix.size()==0){
            return false;
        }
        int m = matrix.size();
        int n = matrix[0].size();
        int i = 0, j = n-1;
        while(i<m && j>=0)
        {
            if( target == matrix[i][j]) return true;
            else if(target<matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
};