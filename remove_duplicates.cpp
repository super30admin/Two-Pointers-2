// Time Complexity : O(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

void removeEle(vector<int>& nums, int index){
    for(int i=index+1; i<nums.size(); i++){
        nums[i-1]=nums[i];
    }
}

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int count=1;
        int i=1;
        int len = nums.size();
        int j=1;
        while(i<len){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            
            if(count <=2){
                nums[j++]=nums[i];
            }
            i++;
        }
      return j;
        
    }  
};

