// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * We use two pointers, one pointing at location which yet to be filled with right element and other itarating over array
 * We keep a variable count to check how many times an element has occured before (starting value as 1)
 * Now we start from index 1 for both pointers which says location 0 has secured with count 1.
 * Now we check if element at index i is same as element at index (i-1).
 * If yes, we check if current count is less than 2. If yes, we put nums[i] at nums[loc] and we increment count and loc pointer
 * If we nums[i] != nums[i-1] then we have found a new element then we copy it at nums[loc] and make count = 1.
 * If found same element i.e. nums[i] == nums[i-1] and count >= 2, then we simply move ahead and dont change loc pointer
 * Which indicates that, whener we will encounter a right element it will go at index pointed by loc pointer.
 * This loc pointer also helps us to tell what is right length of array which we are supposed to return.
*/
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int loc = 1;
        
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == nums[i-1]){
                if(count < 2){
                    nums[loc] = nums[i];
                    count++;
                    loc++;  
                }
            }else{
                nums[loc] = nums[i];
                loc++;
                count = 1;
            }
        }
        
        return loc;
    }
}