// Time Complexity : O(NKlogK) where N=Number of anagrams each having length K
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Two pointer technique

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
       
         if(nums.size()==0){
            return 0;
        }
        int index = 1,count = 1,temp = nums[0];
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i] == temp)
            {
                count++;
            }
            else{
                count = 1;
                temp = nums[i];
            }
            if(count <=2)
            {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
};
