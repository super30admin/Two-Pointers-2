/*
 *                  Search in 2D Matrix
 *
 * Leetcode : https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * 
 * Time complexity : O(M+N)
 * Space complexity : O(1)
 * 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Start from the top-right corner of the matrix and move left if the current 
 *            element is larger than the target or move down if it is smaller, 
 *            continuing until the target is found or the indices go out of bounds.
 */
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();

        int r = 0;
        int c = n - 1;

        while(r < m && c >= 0) {
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
};

int main() {
    Solution solution;
    vector<vector<int>> matrix = {
        {1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };
    int target1 = 5;
    int target2 = 20;

    cout << "Search for target 5: " << (solution.searchMatrix(matrix, target1) ? "Found" : "Not Found") << endl;
    cout << "Search for target 20: " << (solution.searchMatrix(matrix, target2) ? "Found" : "Not Found") << endl;

    return 0;
}