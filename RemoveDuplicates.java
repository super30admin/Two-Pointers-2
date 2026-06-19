// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


// Traverse the sorted array and count how many times the current number appears consecutively.
// Keep at most two occurrences of each number by copying valid elements to the next write position.
// The slow pointer tracks the length of the modified array and the final answer.


class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 1;

        int count = 1;
        for(int fast = 1; fast < nums.length; fast++) {
            if(nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}
