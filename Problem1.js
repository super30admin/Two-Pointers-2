//Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Accepted in LeetCode
//TC is O(n)and SC is O(1)

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let k=2;
    let slow=0;
    for(let i =0;i<nums.length;i++){
        if(i!=0 && nums[i]== nums[i-1]){
            count++;
        }else{
            count=1;
        }

        if(count <=k){
            nums[slow]= nums[i];
            slow++;
        }
    }
    return slow;
};