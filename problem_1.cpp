/ Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int s = 1, f = 1, ctr = 1;
        
        while(f < nums.size()) {
            if (nums[f - 1] == nums[f]) {
                //repeating nums
                ctr++;
            } else {
                ctr = 1;
            }
            if (ctr <= 2) {
                nums[s] = nums[f];
                s++;
            }
            f++;
        }
        
        return s;
        
    }
};
