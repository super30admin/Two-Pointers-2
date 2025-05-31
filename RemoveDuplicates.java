// Time Complexity O(n)
// Space Complexity O(1)
// Runs on LeetCode YES

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int K = 2;
        int slow = 1;
        int fast = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count = count + 1;
            } else {
                count = 1;
            }
            if (count <= K) {
                swap(nums, slow, fast);
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public void swap(int[] nums, int slow, int fast) {
        int temp = nums[slow];
        nums[slow] = nums[fast];
        nums[fast] = temp;
    }
}
