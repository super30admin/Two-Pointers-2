80. Remove Duplicates from Sorted Array II

Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english


class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() == 0) {
            return 0;
        }
        int s = 1; 
        int count = 1;
        int k =2;
        for (int i=1;i< nums.size(); i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= k) {
                nums[s] = nums[i];
                s++;
            }
        }
        return s;
    }
};
