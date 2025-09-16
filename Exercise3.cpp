// Problem - Search a 2D matrix ii
//  Time Complexity : O(m+n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We can start our pointer either from top right or bottom left, here we use
// top right
// 2. We navigate the matrix, if curr element greater than target decrease
// column otheriwse increase row
// 3. In the end if we don't reach target we return false;

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  bool searchMatrix(vector<vector<int>> &matrix, int target) {
    int m = (int)matrix.size();
    int n = (int)matrix[0].size();

    // start from top right corner
    int i = 0;
    int j = n - 1;

    while (i < m && j >= 0) {
      if (matrix[i][j] == target) {
        return true;
      } else if (matrix[i][j] > target) {
        j--;
      } else {
        i++;
      }
    }

    return false;
  }
};
