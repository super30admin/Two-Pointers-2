// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    var j=0;
    for(let i=0;i<nums.length;i++)
    {    
        if(nums[i]!==nums[i+2])
        {
            nums[j]=nums[i];
            j++;
        }
    }
    return j;
};