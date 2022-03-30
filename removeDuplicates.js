
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// k = 2 which means maxium 2 repetation is allowed for certain number
// Taking slow pointer which will maintain the expected output and fast pointer(i) which will iterate over an array of which will starts from index 1.
// Taking count variable which will count how many times certain number have appeared.
// Copy fast pointer value to slow pointer and move slow pointer only when count is less than or equal to k which is 2 in this example.
// return slow pointer at the end as it will hold the response.
/**
 * @param {number[]} nums
 * @return {number}
 */
 var removeDuplicates = function(nums) {
    const k = 2;
    let count = 1;
    let slow = 1;
    for(let i = 1; i < nums.length; i++) {
        if(nums[i] === nums[i-1]) count++;
        else count = 1;
        if(count <= k) {
            nums[slow] = nums[i];
            slow++;
        }
    }
    return slow;
};