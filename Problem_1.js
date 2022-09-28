// Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We keep 2 pointers, i which keeps increamenting, j which stays at answer index
// cnt keeps track of number of times the same number has occured

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    if (nums === null || nums.length === 0) {
        return [];
    }
    // We keep 2 pointers, i which keeps increamenting, j which stays at answer index
    // cnt keeps track of number of times the same number has occured
    let cnt = 1;
    let i = 1, j = 1;
    // start with second number
    while (i < nums.length) {
        // If number is same as previous, increament count
        if (nums[i] === nums[i - 1]) {
            cnt++;
        } else {
            // Else reset to 1
            cnt = 1;
        }
        // If cnt is less than or equal to 2, replace element at i with j and increament both
        if (cnt <= 2) {
            nums[j] = nums[i];
            j++;
        }
        i++;
    }
    return j;
};
