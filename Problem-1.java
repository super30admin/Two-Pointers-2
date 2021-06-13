
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// We iterate over the array using fast pointer and checking if it is repeating with previous element or not
// We keep the counter for tracking repeating element.
// We use slow pointer to keep track of current position in new array with max 2 repeating numbers
// when counter is less than 2, we move the element at fast to slow and increment slow ptr

class Solution1 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        int n = nums.length;

        int slow = 1, fast = 1;
        int counter = 1;

        while (fast < n) {
            if (nums[fast] == nums[fast - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}
