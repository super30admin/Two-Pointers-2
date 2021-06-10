//O(m+n) solution in O(1) space. This was something that I had to be bloody einstein to come up with

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rowNum = matrix.size();
        if (rowNum == 0) return false;
        int colNum = matrix[0].size();
        if (colNum == 0) return false;
        
        int row = rowNum - 1, col = 0;
        while (row >= 0 && col < colNum) {
            if (matrix[row][col] < target) ++col;
            else if (matrix[row][col] > target) --row;
            else return true;
        }
        return false;
    }
};
