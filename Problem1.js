// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {number}
 */

 var removeDuplicates = function(nums) {
    let count = 0, k = 0;

    for(let i = 0; i < nums.length; i++) {
        if(nums[i] !== nums[i+1]) {
            nums[k] = nums[i];
            k++;
            count = 0;
        }
        if (nums[i] === nums[i+1] && count < 1) {
            nums[k] = nums[i];
            k++;
            count++;
        }
    }
    return k;
};