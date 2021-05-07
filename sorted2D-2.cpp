// Time Complexity :O(m+n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n = matrix[0].size()-1;
        int m = matrix.size()-1;
        int r = 0;
        int c = n;
        while(r <= m && c >=0){
           if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else r++; 
        }
        return false;
    }
};