// Problem - Remove duplicates from sorted array 2
//  Time Complexity : O(n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We use two pointers here, wwe keep incrementing our count till our curr ==
// previous value
// 2. If count <=2, then we assign nums[slow] = nums[i] and increment slow
// 3. This way we only allow k duplicates in our array

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int removeDuplicates(vector<int> &nums) {
    int i = 0;
    int slow = 0;
    int n = (int)nums.size();
    int count = 0;
    while (i < n) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        count++;
      } else {
        count = 1;
      }
      if (count <= 2) {
        nums[slow] = nums[i];
        slow++;
      }
      i++;
    }

    return slow;
  }
};
