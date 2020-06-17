// Time Complexity : O(n), where n is the number of elements in vector.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES


class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
         if(nums.size()==0){
            return 0;
        }
        int count = 1;
        int j = 1;
        
        for(int i = 1; i<nums.size(); i++){
            if(nums[i-1]==nums[i]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;  
    }
};