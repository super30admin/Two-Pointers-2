
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
    1. Iterate from the top left and move inwards loacting the target element
    2. Increment the pointer to bottom if target is greater than the current
    3. If the target is smaller than the current then move to the left of the current
*/

// Your code here along with comments explaining your approach

class Solution
{
public:
    bool searchMatrix(vector<vector<int>> &matrix, int target)
    {
        if (matrix.empty() || matrix.size() < 0)
        {
            return false;
        }

        int t = 0, b = matrix[0].size() - 1;

        while (t < matrix.size() && b >= 0)
        {
            if (matrix[t][b] == target)
            {
                return true;
            }
            else if (matrix[t][b] > target)
            {
                b--;
            }
            else
            {
                t++;
            }
        }

        return false;
    }
};