// ## Problem1 
// (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :

// ## Problem1 
// (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const removeDuplicates = function(nums) {
    if(!nums || nums.length === 0) return 0;
    let slow = 0; let fast = 1;
    let flag = false;
    while(fast < nums.length) {
        if(nums[slow] === nums[fast]) {
            if(!flag) {
                flag = true;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
            else {
                while(fast < nums.length && nums[fast] === nums[slow]) fast++;
            }
        }
        else {
            flag = false;
            slow++;
            nums[slow] = nums[fast];
            fast++;
        }
    }
    return slow + 1;
};