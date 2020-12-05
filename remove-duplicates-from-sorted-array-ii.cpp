//Time complexity - O(n)
//Space complexity - O(1)

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()<3) return nums.size();
        int i=1,j=1;
        
        while(j<nums.size()){
            swap(nums[i],nums[j]);
            i++;j++;
            if(nums[i-1] == nums[i-2]){
                while(j<nums.size() && nums[j]==nums[i-1]) j++;
            }
        }
        
        return i;
    }
};