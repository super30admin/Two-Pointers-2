/*
Time complexity - O(M+N)
Space complexity - O(1)
*/
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if (matrix.size() == 0 || matrix[0].size() == 0) return false;
        int r = 0, c = matrix[0].size() - 1;
        while (r < matrix.size() && c >= 0){
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) --c;
            else ++r;
        }
        return false;
    }
};