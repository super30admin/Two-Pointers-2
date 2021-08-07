//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
/*
Time: O(n)
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class RemoveDups2 {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int i = 1;

        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;

    }

}
