// Time Complexity: O(n+m) where n and m rows and cols of the matrix
// Space Complexity:O(1)

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows = matrix.size();
        int cols = matrix[0].size();
        int ptr_r = 0;int ptr_c = cols-1;
        while(ptr_r<rows && ptr_c >=0){
        if(target == matrix[ptr_r][ptr_c])return true;
        if(target < matrix[ptr_r][ptr_c])ptr_c--;
        else ptr_r++;
        }
        return false;
        
    }
};

