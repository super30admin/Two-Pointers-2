// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i=1;
        int k = 2;
        int count = 1;
        for(int j = 1;j< nums.size();j++){
            if(nums[j] == nums[j-1]){
                count++;        
            }
            else{
                count = 1;   
            }
            if (count <=k)
                nums[i++] = nums[j];
        }
        return i;
    }
};