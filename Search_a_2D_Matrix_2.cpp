//  240_Search_a_2D_Matrix_2
/*
 Reduce search space appraoch
 [1,   4,  7, 11, 15]
 [2,   5,  8, 12, 19]
 [3,   6,  9, 16, 22]
 [10, 13, 14, 17, 24]
 [18, 21, 23, 26, 30]
 
 Set pointers (row , col) to top right element (or bottom left). If current element is target return true.
 If target is less than current element decrement col pointer else increment row pointer. If any
 pointer goes out of bound, then element is not present return false.
 
 TC:O(N+M) ,  N = number of rows, M = number of columns
 SC: O(1)
 
*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target){
        if(matrix.size() == 0 || matrix[0].size() == 0)
            return false;
        int n = matrix.size(), m = matrix[0].size();
        int r = 0;
        int c = m - 1;
        while (r <= n-1 && c >= 0) {
            if (matrix[r][c] == target)
                return true;
            //search space reduction
            else if(target < matrix[r][c])
                c--;
            else if(target > matrix[r][c])
                r++;
        }
        
        return false;
    }
};
int main(int argc, const char * argv[]) {
    vector<vector<int>> matrix={{1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}};
    Solution s;
    std::cout << s.searchMatrix(matrix, 8)<<"\n";
    return 0;
}
