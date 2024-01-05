// Time Complexity : O(n)
// Space Complexity : O(1)

// remove duplicate from sorted array 
var removeDuplicates = function (nums) {
    if (nums == null || nums.length == 0) return 0;
    let n = nums.length
    let sp = 0
    let count = 1
    for (let i = 1; i < n; i++) {
        if (nums[i] === nums[i - 1]) {
            count += 1
        } else {
            count = 1
        }
        if (count <= 2) {
            sp += 1
            nums[sp] = nums[i]
        }
    }
    return sp + 1
};