// TC = O(n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        // null
        if(nums.size() == 0) return 0;
        int slow = 1, count = 1, k = 2;
        for(int i = 1; i < nums.size(); i++) {
            if(nums[i] == nums[i - 1]) count++; // finding the same element
            else count = 1;                     // new element found, resetting the count
            if(count <= k)                      // k = frequency of duplicates allowed, here 2
                nums[slow++] = nums[i];         // place in its correct position
        }
        return slow;
    }
};