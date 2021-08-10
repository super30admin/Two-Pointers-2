// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0)
            return 0;
        int i = 1, j = 1, cnt = 1;
        int n = nums.size();
        while(i<n && j<n){
            if(nums[i] == nums[i-1])
                cnt++;
            else
                cnt=1;
            if(cnt <= 2){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
};
