// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : It ran successfully
// Any problem you faced while coding this : None

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        bool flag = false;
        int slow = 0;
        int fast = 1;
        
        if(nums.size() == 0 || nums.size() == 1 || nums.size() == 2){
            return nums.size();
        }
        while(fast <= nums.size() - 1){
            if(nums[slow]==nums[fast]){
                if(!flag){
                    flag = true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                }
                else{
                    fast++;
                }
            }
            else{
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return ++slow;
    }
};