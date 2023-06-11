// Time Complexity : O(n) as we traverse the array linearly once
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int count = 0;
        int left = 0;
        int right = 0;
        int n = nums.length;
        int previousNumber = nums[right];

        while (right < n) {
            while (right < n && nums[right] == previousNumber) {
                if (count < 2 && left < n) {
                    swap(left, right, nums);
                    left++;
                }
                count++;
                right++;
            }
            //found a new number, reset
            count = 0;
            if (right < n) {
                previousNumber = nums[right];
            }
        }
        return left;
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}