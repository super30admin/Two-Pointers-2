
// Time Complexity : O(n+m) where n is the number of rows and m is the number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Start from either top-right or left-bottom.
// If the current element is the target return true else if it's lesser then check in the next col/row.
// else check in the previous col/row.

// Your code here along with comments explaining your approach

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n = matrix.size();
        int m = matrix[0].size();
        int i=0; int j = m-1;
        while(i<n && j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
};