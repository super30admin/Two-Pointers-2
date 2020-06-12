// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==0) return false;
        int row = matrix.size();
        int col = matrix[0].size();
        
        int i=row-1;
        int j=0;
        
        while(i>=0 && j<col){
            if(matrix[i][j]==target){
                return true;
            }
            
            else if(matrix[i][j]>target){
                i--;
            }
            
            else{
                j++;
            }
        }
        
        return false;
        
    }
};
