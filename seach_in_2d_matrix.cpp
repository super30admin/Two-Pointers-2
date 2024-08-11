// time : O(m+n)
// space : O(1)

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size() -1;
        int col = 0;
        while(row>=0 && col < matrix[0].size())
        {
            if(matrix[row][col] == target)
            {
                return true;
            }
            else if(matrix[row][col] < target)
            {
                col++;
            }
            else{
                row--;
            }
        }

        return false;
    }
};