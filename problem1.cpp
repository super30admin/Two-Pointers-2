/*
Time complexity - O(N)
Space complexity - O(1)
*/
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0) return 0;
        int slow = 1, count = 1;
        for (int i = 1; i < nums.size(); ++i){
            if (nums[i] == nums[i - 1]) ++count;
            else count = 1;
            if (count <= 2){
                nums[slow++] = nums[i];
            }            
        }
        return slow;
    }
};