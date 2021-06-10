//2 pointers with i & count
//O(n) + O(1) solution
//this works because we go through all numbers and gets the size
//if we mutilate array without using extra array (void funcn), that'd be O(n^2)
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = nums.size(), count = 0;
    for (int i = 2; i < n; i++)
        if (nums[i] == nums[i - 2 - count]) count++;
        else nums[i - count] = nums[i];
    return n - count;
    }
};
