//80. Remove Duplicates from Sorted Array II

/*
Use a pointer to keep only atmost two occurrences of a number while iterating through the array

Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int slow = 0, count=1;
        for(int i=1; i<nums.size(); i++){
            if(nums[i] == nums[i-1]) count++;
            else count = 1;

            if(count <= 2){
                slow++;
                nums[slow] = nums[i];
            }
        }

        return ++slow;
    }
};