class Solution {

    /**
     * Solve using 2 pointers. Keep count to track duplicate. Override low pointer until count is 2. move fast pointer forward if count is more than 2. Rest counter once new element is found.
     * Time: o(n)
     * Space: O(1)
     */

    public int removeDuplicates(int[] nums) {
        //edge
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int slow = 1;
        int fast = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            } else {
                fast++;
            }
        }
        return slow;
    }
}
