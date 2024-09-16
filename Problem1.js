// Remove Duplicates (LC 80)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Count everytime I see a duplicate, and if I have 2 or less duplicates I increment j which is the index I increase till I get through the array

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    if(nums === null || nums.length === 0){
        return;
    }
    let j = 1; let count=1;
    let n = nums.length - 1;
   for(let i=1;i<nums.length;i++){
       if(nums[i]===nums[i-1]){
           count++;
       } else {
           count = 1;
       }
        if(count <= 2){
            nums[j] = nums[i];
            j++;
       }
    }
    return j;
};