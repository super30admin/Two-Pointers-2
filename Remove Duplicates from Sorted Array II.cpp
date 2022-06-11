//Time Complexity- O(n)
//Space Complexity- O(1)

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        if(nums.size()<2){
            return nums.size();
        }
        int i=2;
        int j=2;
        
        while(j<nums.size()){
            if(nums[j]!=nums[i-2]){
                swap(nums[i],nums[j]);
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        return i;
    }
};