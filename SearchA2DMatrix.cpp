//Time Complexity O(m+n)
//Space Complexity o(1)

//problem successfully compiled on leetcode
//No problems faced while coading

#include <iostream>
#include <vector>
using namespace std;


class Solution {
public:
    bool searchMatrix(vector<vector<int> >& matrix, int target) {
        int rows=matrix.size();
        int cols=matrix[0].size();
        int m=0;
        int n=cols-1;
        
        while(m<rows && n>=0)
        {
            if(matrix[m][n]==target)
            {
                return true;
            }
            else if(target > matrix[m][n])
            {
                m++;
            }
            else
            {
                n--;
            }
        }
        return false;
    }
};