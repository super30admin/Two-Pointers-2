// TC: O(n)
// SC: O(1)
// Working on leetcode
// No problem faced

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1; 
        int i = 1;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > 2) {
                    removeElement(nums, i);
                    i--;
                    n--;
                }
            } else {
                count = 1;
            }
            i++;
        }
        return n;
    }
    private void removeElement(int[] nums, int index) {
        for(int i = index + 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
    }
}
