// Time complexity is O(n)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 Maintain two pointers i, j.
 Check for duplicates and increment the count accordingly.
 When the count <= 2, we replace the value at 'j' with that the value at 'i' and increment 'j' pointer.
 */
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(!nums.size()) return 0;
        int count = 1;
        int j = 1;
        for(int i = 1; i < nums.size(); i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }
            else {   
                count = 1;
            }
            
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
};
