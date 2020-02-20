// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Maintain a count of the current number.  If the count ever hits 2, keep moving it right.

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if (nums == null || nums.length == 0) return 0;

    let j = 1,
        count = 1;

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
            count++;
        } else {
            count = 1;
        }

        if (count <= 2) {
            nums[j++] = nums[i];
        }
    }
    return j;
};
