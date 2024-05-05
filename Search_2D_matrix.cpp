//Time O(nxm)
//Space O(1)
//Leetcode: yes
//Issue seen: none
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = 0, maxRow=matrix.size()-1;
        int col = matrix[0].size()-1, minCol=0;

        while(row <= maxRow && col >= minCol){
            if(target == matrix[row][col]){
                return true;
            } else if(target < matrix[row][col]){
                col--;
            } else if(target > matrix[row][col]){
                row++;
            }
        }
        return false;
    }
};
