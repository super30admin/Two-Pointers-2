class Solution {
    // TC - O(n);
    // SC - O(1);
public:
    int removeDuplicates(vector<int>& nums) {
        int currentIndex = 0;
        int iterator=0;
        bool atSecond = false;
        while(iterator<nums.size()){
            if(iterator+1 <nums.size() && nums[iterator] == nums[iterator+1] && !atSecond && nums[currentIndex] == nums[iterator]){
                   nums[++currentIndex] = nums[iterator];
                   iterator++;
                   atSecond = true; // move the index to second index of duplicate 
            }
           else if(nums[currentIndex] == nums[iterator]){
                iterator++;
            }
            else{
                nums[++currentIndex] = nums[iterator];
                atSecond = false;
            }
        }
       return currentIndex+1; 
    }
};