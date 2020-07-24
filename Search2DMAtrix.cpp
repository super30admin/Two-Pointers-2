// Time Complexity : O(M*N) where N=Number of anagrams each having length K
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Start from bottom left and do binary search

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==0)
            return false;
        int m= matrix.size(),n=matrix[0].size();
        int r= m-1,c=0;
        
        while(r>=0 && c<n)
        {
            if(matrix[r][c] == target)
            {
                return true;
            }
            else if(matrix[r][c]<target)
            {
                c++;
            }
            else{
                r--;
            }
        }
        return false;
        
    }
};
