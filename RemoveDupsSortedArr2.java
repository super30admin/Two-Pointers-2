// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * As we want to solve this in-place we start i and j pointers from index 1 and count = 1. i will always move forward and j will move forward only when
 * count is valid(<=2) we copy value from i as i always moves, in j and j++. If current i == nums[i-1] we increment count or 
 * set to 1 as array is sorted it means we have new element. 
 */

public class RemoveDupsSortedArr2 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }

        int j = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
