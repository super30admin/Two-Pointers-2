
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach: We maintain a pointer for iterating through array upto n-2 and
// another for replacing the number if it is present more than twice.

// Your code here along with comments explaining your approach

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length < 3) return nums.length;
        int j = 0;
        for(int i = 0; i < nums.length-2; i++) {
            if(nums[i]!=nums[i+2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j++] = nums[nums.length-2];
        //j++;
        nums[j++] = nums[nums.length-1];
        return j;
    }
}
