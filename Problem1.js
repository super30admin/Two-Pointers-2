// ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Did this code successfully run on Leetcode : YES
var removeDuplicates = function(nums) {
    // Time Complexity : O(N)
    // Space Complexity : O(1)
    let k = 2;
    let l = 1;
    let r = 1;
    let count = 1;
    while (r < nums.length) {
        //use right pointer keep on comparing
        if (nums[r] === nums[r - 1]) {
            //if we see the current element same as the previous one that means its same and increase count
            count++;
        } else {
            //not same make it 1
            count = 1;
        }
        //if the next count is less than 2 we can swap with left
        if (count <= k) {
            nums[l] = nums[r];
            //increment left
            l++;
        }
        //keep on pushing right pointer
        r++;
    }
    return l;
};
