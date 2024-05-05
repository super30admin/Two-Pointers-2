//Time O(n)
//Space O(1)
//Leetcode: yes
//Issue : none
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
         int n = nums.size();
        int fast=0;
        int slow=0;
        int count=0;

        for(int fast=0; fast<n; fast++){
            if(fast>0 && nums[fast] == nums[fast-1]){
                count++;
            } else {
                count = 1;
            }
            if(count <= 1){
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
};
