// Time Complexity : O(n) where n is the length of nums
// Space Complexity : O(1) since we are modifying the array in-place
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :
// We traverse the sorted array with two pointers (slow and fast).
// In the first approach, we use a counter to ensure each element appears at most k times.
// In the optimized approach, we eliminate the counter by comparing nums[fast] with nums[slow - k].

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 2;   // each element can appear at most 2 times
        int count = 0; 
        int slow = 0, fast = 0;

        while (fast < nums.length) {
            // if current element is same as previous, increment count
            if (fast > 0 && nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                // new element, reset count
                count = 1;
            }

            // only allow up to k occurrences
            if (count <= k) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow; // new length of array
    }
}

class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int k = 2;   // each element can appear at most 2 times
        if (nums.length <= k) return nums.length; // no need to process small arrays

        int slow = k, fast = k; // start both from k index
        while (fast < nums.length) {
            // check if current element is different from element slow-k behind
            if (nums[fast] != nums[slow - k]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow; // new length of array
    }
}
