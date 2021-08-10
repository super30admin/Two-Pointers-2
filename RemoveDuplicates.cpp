// Time Complexity : O(N) where N is the size of the array
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Submission Link: https://leetcode.com/submissions/detail/536365585/

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int j = 1, cnt = 1;
        
        for(int i = 1; i < nums.size(); i++){
            
            if(nums[i] == nums[i - 1])
                cnt++;
            else
                cnt = 1;
            
            if(cnt <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
};