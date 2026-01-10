class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=matrix.size();
        if (row==0) {
            return false;
        }
        int col=matrix[0].size();
        if (col ==0) {
            return false;
        }

        int left = 0;
        int right = col-1;
        while (left < row && right >= 0) {
            if (matrix[left][right] == target) {
                return true;
            }

            if (matrix[left][right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
};
