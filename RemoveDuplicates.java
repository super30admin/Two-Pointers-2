// Time Complexity : O(n) where n is the nums array length
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
Using Two Pointers Approach, one to iterate through the loop and the other to update the array.
When iterating check if there are more than two duplicates, if exists skip the element,
while iterating enter the non-duplicates or only once duplicate element from the front of the array.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i=1,j=1,count=1;
        while(i < nums.length){
            if(nums[i] == nums[i-1])
                count++;
            else count = 1;
            if(count <= 2)
                nums[j++] = nums[i];
            i++;
        }
        return j;
    }
}
