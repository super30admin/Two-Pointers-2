class Solution {
    /**
     * # Time complexity: O(n), where n is the length of the array, as we iterate through the array once.
     * # Space complexity: O(1), as no extra space is used other than variables.
     * # Leetcode: Yes
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int j = 1;
        int count = 1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
