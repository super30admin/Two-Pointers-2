/*
 ? Problem: Remove Duplicates from sorted array 2
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

#include <vector>

class Solution {
public:
    int removeDuplicates(std::vector<int>& nums) {
        int l = 0, r = 1, count = 1;

        while (r < nums.size()) {
            if (nums[r] == nums[r - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                l++;
                nums[l] = nums[r];
            }

            r++;
        }

        return l + 1;
    }
};