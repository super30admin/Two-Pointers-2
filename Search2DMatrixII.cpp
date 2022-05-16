// Time Complexity :  O(n + m) where n, m = input array size. 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english

/* Variable i -> row index and j -> column index of pointer.
 * Assign a pointer to top right corner of matrix. Repeat the following process until the pointer is within the bounds of matrix dimensions.
 *     If matrix[i][j] is equal to target then return true. If matrix[i][j] > target then decrement the column index j else increment row index i.
 * If loop terminated then return false indicating element not present in matrix.
 * 
 * Same thing can also be done by starting from bottom left of array.
 */

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if (matrix.size() == 0)
            return false;
        int i = 0;
        int j = matrix[0].size() - 1;
        
        while (i < matrix.size() && j >= 0)
        {
            if (matrix[i][j] == target)
                return true;
            
            if (target < matrix[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
};