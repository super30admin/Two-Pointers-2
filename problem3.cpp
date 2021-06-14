// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// in this solution since both rows and colums of the matrix are sorted  we can start at the end of first row if the target is greater than curent element move to the next row if it is lesser than the current value decrease the column

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m= matrix.size();
        int n= matrix[0].size();
        int i= 0 ; int j= n-1;
        while(i <m && j>=0)
        {
             
             if(matrix[i][j] > target)
            {
                j--;
            }
            else if(matrix[i][j] < target)
            {
                i++;
            }
            else
            {
                return true;
            }
                    
        }
          return false;
        
    }
};
