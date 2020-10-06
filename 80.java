/**
 * @param {number[]} nums
 * @return {number}
 */

/**Algorithm:
Let p1 point at starting point and p2 is next/ahead of p1 initially.
Count is to track when the number has appeared twice.
if p1 = p2 then increment p2 and count++
else if p1 = p2  and count > 2 then p2++
else if p1 != p2 then p1 = p1+count
End point - when p2 = nums.length - 1
**/

//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

var removeDuplicates = function(nums) {
    
    if (nums.length <= 2) return nums.length;
    
    var p1 = 0;
    var p2 = 1;
    var count = 1;
    
    while(p2 <= nums.length){
        if(nums[p1] === nums[p2] && count<=2){
            p2++;
            count++;
        }
        else if(nums[p1] === nums[p2] && count>2){
            p2++;
        }
        else{ //when they are not equal
            if(count >= 2){
                p1 = p1+2;
            }
            else{
                p1 = p1+count;
            }
            nums[p1]=nums[p2];
            count = 0;
        }
    }
    return p1;
    
};


/**

var removeDuplicates = function(nums) {
    var ans = 0
    for(var i = 0; i < nums.length; ++i){
        nums[ans] = nums[i]
        ans++
        if(nums[i + 1] === nums[i]){
            nums[ans] = nums[i]
            ans++
            while(nums[i + 1] === nums[i]) i++
        }
    }
    return ans
};
**/