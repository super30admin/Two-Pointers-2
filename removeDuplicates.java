//time complexity: O(n)
//space complexity: O(1)
//Any problem you faced while coding this : No
//Did this code successfully run on Leetcode : Yes

/**
 * The slow pointer captures the position where the next unique element should be placed.
 * The fast pointer helps identify the next unique element after retaining the current element for k times.
 * Once the fast pointer traverses the entire array, the slow pointer indicates the new length of the modified array that contains each element at most k times.
 */

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
     
        int k=2;
        int fast=k;
        int slow=k;
        while(fast<nums.length)
        {
            if(nums[fast]!=nums[slow-k])
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
        
    }
}