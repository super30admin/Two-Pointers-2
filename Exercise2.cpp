// Problem - Merge sorted array
//  Time Complexity : O(m+n)
//  Space Complexity :O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We take two pointers and each of the pointers points to the last valid
// index of the arrays
// 2. We start comparing the elements and replacing them with the idx which is
// initially set to m+n-1
// 3. We check the remaining elements of nums2 if the j >= 0 and add them in
// nums[1]

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  void merge(vector<int> &nums1, int m, vector<int> &nums2, int n) {
    int idx = m + n - 1;
    int i = m - 1;
    int j = n - 1;
    while (i >= 0 && j >= 0) {
      if (nums2[j] > nums1[i]) {
        nums1[idx] = nums2[j];
        j--;
      } else {
        nums1[idx] = nums1[i];
        i--;
      }
      idx--;
    }

    while (j >= 0) {
      nums1[idx] = nums2[j];
      j--;
      idx--;
    }
  }
};
