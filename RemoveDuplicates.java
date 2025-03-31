// Time Complexity : O(n), where n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Use two pointers: one l for placing valid elements and another r for scanning the array.
// 2. Allow each unique element to appear at most twice while keeping track of occurrences.
// 3. If an element appears more than twice, skip the extra occurrences and continue processing.

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int r = 0;
        int count = 0;
        int z= nums[0];
        while(r<nums.length)
        {
            if(nums[r] == z)
            {
                count++;
            }
            if(nums[r] !=z)
            {
                count = 1;
                z = nums[r];
            }
            if(count >2)
            {
                while(r<nums.length && z==nums[r])
                {
                    r++;
                }
                if(r>=nums.length)
                {
                    return l;
                }
                z = nums[r];
                count = 1;
            }
            nums[l] = nums[r];
            r++;
            l++;
        }
        return l;
    }
}
