// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.empty())
            return 0;

        int prev = 0;
        int slow = 1;
        int fast = 1;
        int flag = 0;

        while (fast < nums.size()) {
            if (nums[fast] == nums[prev]) {
                if (flag == 0) {
                    nums[slow] = nums[fast];
                    slow++;
                    fast++;
                    flag = 1;
                } else {
                    fast++;
                }
            } else {
                prev = fast;
                nums[slow] = nums[fast];
                slow++;
                fast++;
                flag = 0;
            }
        }

        return slow;
    }
};