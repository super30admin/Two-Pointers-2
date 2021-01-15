//Time Complexity: O(N) where N is the length of nums array
//Space Complexity: O(1)

//Successfully runs on leetcode : Time: 0 ms

//Approach: Here, we are taking two pointers: slow and fast both initialized to index 1 of the array. Now, there are two
//conditions to check: if nums(fast) = nums(fast-1) ---> we increment the count, else we reset the count to 1. For both the
//conditions, we make sure that the count remains less than 2 and to get the resultant array: we swap nums at slow and fast 
//until we have 2 or less than 2 nums of each type and we will return slow pointer which will have the result.


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        int slow = 1;
        int fast = 1;
        
        while(fast < nums.length)
        {
            if(nums[fast] == nums[fast-1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            
            if(count <= 2)
            {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}