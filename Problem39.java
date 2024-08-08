// Time Complexity : O(n)
// Space Complexity : O(1)
// 80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2; // Start from index 2 because the first two elements are always allowed.
        for (int i = 2; i < nums.length; i++) {
            // Check if the current element is different from the element at index k-2
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}