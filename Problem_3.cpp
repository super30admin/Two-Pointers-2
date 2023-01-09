
240. Search a 2D Matrix II
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.


// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size();
        int n = matrix[0].size();
        int i=0, j= n-1;

        while ((i<m) && (j>=0)) {
            if(matrix[i][j] == target) return true;
           else if(matrix[i][j] < target) {
               i++;
            } else j--;
        }
        return false;
    }
};
