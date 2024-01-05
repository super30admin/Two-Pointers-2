// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Three line explanation of solution in plain english
// Idea here is to start from lower left corner and traverse the matrix to find the target. Since rows and 
// columns are sorted in ascending manner, if cell value is larger than target then all values to right of 
// that cell has larger, hence we move up. if cell value is lesser than target then all values to the right 
// of that cell has larger values, hence we move right. We repeat this process until we find the target.

// Your code here along with comments explaining your approach
#include<vector>
class Solution {
public:
    bool searchMatrix(std::vector<std::vector<int>>& matrix, int target) {
        int r = matrix.size()-1;
        int c = 0;

        while(r >= 0 && c < matrix[0].size())
        {
            // as rows are sorted and columns are sorted ascending manner. if cell value is 
            // larger than target then all values to right of that cell has larger, hence we move up.
            if(matrix[r][c] > target)
            {
                r--;
            }
            else if(matrix[r][c] < target) // if cell value is lesser than target, we jump to the next biggest element
            {
                c++;
            }
            else //target found
            {
                return true;
            }
        }
        return false;
    }
};