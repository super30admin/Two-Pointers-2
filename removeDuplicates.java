
// Time Complexity :O(n) n is the length of the matrix
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: 
// Take 2 pointers and place it on the 2nd element of the array. Now check if the previous number is equal to the current number.
// If yes, then increase the count and increase both poitners. If not set the counter to 1 and place the element at 2nd pointer pos to the 1st pointer pos.Bring 1st pointer to the same pos of 2nd pointer.
// If the count is more than 2 then just keep increasing the 2nd pointer.

// Your code here along with comments explaining your approach


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length<0) return 0;
        
        int m = 1;
        int count = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                if(count<2){
                    nums[m++] = nums[i];
                }
                count ++;
            }
            else{
                count=1;
                nums[m++] = nums[i];
            }
        }
        
        return m;
        
    }
}