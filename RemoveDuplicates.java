class Solution {
    public int removeDuplicates(int[] nums) {

        // edge case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initializing the slow and count to 1 as the fisrt element is occured only
        // once till now in the array, we dont consider it
        int count = 1;
        int slow = 1;

        // Iterating the array with fast pointer
        // if the present value at fast value is equal to previous value then increment
        // the counter
        // else set counter to 1 as we encounterd a new value
        // check if the counter is less than or equal to 2
        // then copy the values at fast pointer to solw pointers location and increment
        // slow pointer
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        // return slow pointer index
        return slow;
    }
}

// Time Complexity :O(n)
// Space Complexity : O(1)