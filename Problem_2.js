// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Using two pointers, slow and fast we keep track of correct set of values within the slow pointer indices for the given instance of fast pointer;
// In this solution, the iterator i is the fast pointer, duplicate is slow pointer. duplicate keeps copying over the valid values if it is 
// within the number of allowed duplicate bounds i.e. 2 (for this problem). Fast pointer runs ahead to find unique elements and reset the counter till all array elements are scanned. 
// We return the duplicate pointer + 1 value since we start the duplicate at 0th index. 

// Your code here along with comments explaining your approach
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    // slow pointer to keep track of correct values
    let duplicate = 0;
    //counter to track duplicates
    let count = 1;
    for(let i=1; i<nums.length; i++){
        //Count the number of occurances of same element
        if(nums[i] === nums[i-1]){
            count++;
        }   
        else{
            count = 1;
        }
        //If number is within valid limit, i.e. 2 in this case, then we swap the element with the nums[i]; This helps is copying over the valid numbers into the lower indices and push the duplicates to the end of the array. 
        if(count <=2){
            duplicate++;
            nums[duplicate] = nums[i];
        }
    }
    return duplicate+1;
};