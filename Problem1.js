// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

var removeDuplicates = function (nums) {
    if (!nums || nums.length === 0) return [];
    let j = 1, count = 1;
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] === nums[i - 1]) {
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
};