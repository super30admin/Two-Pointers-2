// Time Complexity: O(m+n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

//Approach:
// Start in either bottom left element or top right(As these are the only two places from where we can make a decision)
// Depending on where you start and if target is greater or lesser move to next row/Col

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        // int m = matrix[0].size();
        // int n = matrix.size();
        int row = 0;
        int col = matrix[0].size()-1;
        while(row < matrix.size() && col >= 0){
            int curr = matrix[row][col];
            if(curr == target){
                return true;
            }
            else if(curr < target){
                row++;
            }
            else{col--;}
        }
        return false;
    }
};