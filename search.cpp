//search in matrix
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int i=0;
        int j=matrix[0].size()-1;
        
       while(i<matrix.size() and j>=0)
       {
           if(matrix[i][j]==target)
               return true;
           else if(matrix[i][j]<target)
           {
               i++;
           }
           else 
               j--;
       }
        return false;
        //Time complexity : O(N+M)
        //Space complexity: O(1)
    }
};
