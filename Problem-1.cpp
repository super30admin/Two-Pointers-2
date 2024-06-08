// Time Complexity : O(n) where n is size of nums array
// Space Complexity : O(1) no extra space apart from couple of variables and nums array is modified in-place
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int swap_idx = 1;
        int trav_idx = 1;
        int count = 1;
        while(trav_idx < nums.size())
        {
            if(nums[trav_idx] == nums[trav_idx - 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if(count<=2)
            {
                nums[swap_idx] = nums[trav_idx];
                swap_idx++;
            }
            trav_idx++;
        }
        return swap_idx;
    }
};