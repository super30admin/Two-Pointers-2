
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Start at the top right most cell
// Notice that when you go down one row, the numbers are increasing and when you go one column left, the numbers are decreasing
// Use this idea to go left/down based on the relationship between the number in the cell we are checking and the target

// Your code here along with comments explaining your approach
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(); int n = matrix[0].size();
        int i = 0; int j = n-1; // start at top right cell
        while(i < m && j >= 0) {
            int num = matrix[i][j];
            if(num == target) {
                return true;
            } else if(num < target) { // go down one row
                i++;
            } else { // go left one column
                j--;
            }
        }  
        return false;  
    }
};