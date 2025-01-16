// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 240: Search a 2d matrix ii
// Approach: 2 Pointers
// Time Complexity: O(m+n)

class Solution
{
public:
    bool searchMatrix(vector<vector<int>> &matrix, int target)
    {

        // Base Case
        if (matrix.empty())
        {
            return false;
        }

        int m = matrix.size();
        int n = matrix[0].size();

        // Set initial pointer to top right element of the matix
        int row = m - 1;
        int col = 0;

        // Condition for loop
        while (row >= 0 && col < n)
        {

            // If target is found return
            if (matrix[row][col] == target)
            {
                return true;
            }

            // For high target value move down, for less move left
            else if (matrix[row][col] < target)
            {
                col++;
            }
            else
            {
                row--;
            }
        }
        return false;
    }
};