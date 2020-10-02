
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=matrix.size();
        if(row==0)
            return false;
        
        int col=matrix[0].size();
        if (col==0) {
          return false;  
        }
        
        int i=0;
        int j=col-1;
        
        while (i<row && j>=0) {
            if (matrix[i][j]==target) {  //target found in the first go
                return true;
            }
            
            if (matrix[i][j]< target) { // is the element is lesser than the target then go down the row
                i++;
            } else { // is the element is larger than the target then go back in the columns
                j--;
            }
        }
        return false;
    }
};