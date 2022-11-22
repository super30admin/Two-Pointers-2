// Time Complexity : O (n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Using two pointers i, j and traverse through the nums array. Replace the jth index with ith index if count <=2 and return the j that holds the sorted array with at max two repeated values.

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  if (nums.length === 0 || nums === null) return 0;

  var n = nums.length;
  var j = 1;
  var count = 1;

  for (var i = 1; i < n; i++) {
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
