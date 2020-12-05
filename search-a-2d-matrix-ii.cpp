//Time complexity = O(m+n)
//Space complexity - O(1)

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int n = matrix.size(), m = matrix[0].size();
        int r = 0,c = m-1;
        
        if(target>matrix[n-1][m-1] || target<matrix[0][0]) return false;
        
        while(r<n && c>-1){
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c]<target) r++;
            else if(matrix[r][c]>target) c--;
        }
        
        return false;
    }
};