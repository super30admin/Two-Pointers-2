Time Complexity-O(m+n)
Space Complexity-O(1)
Did the code on Leetcode? yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if(matrix.size()==0)
        {
            return 0;
        }
        int low=0;
        int high=matrix[0].size()-1;
        while(low<matrix.size() && high>=0)
        {
            if(matrix[low][high]==target)
            {
                return true;
            }
            else if(matrix[low][high]<target)
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return false;
    }
};

int main() {
     vector<vector<int>>m=  {
                                {1,   4,  7, 11, 15},
                                {2,   5,  8, 12, 19},
                                {3,   6,  9, 16, 22},
                                {10, 13, 14, 17, 24},
                                {18, 21, 23, 26, 30}
                            };
    Solution soln;
    bool result=soln.searchMatrix(m,16);
    cout<<result;
	return 0;
}