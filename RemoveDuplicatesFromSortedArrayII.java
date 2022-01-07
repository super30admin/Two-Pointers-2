// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int val = nums[0];
        int count = 0;

        while (j < nums.length) {
            if (val == nums[j]) {
                count++;

                if (count < 3) {
                    nums[i] = nums[j];
                    i++;
                }
                j++;
            }
            else {
                val = nums[j];
                count = 0;
            }
        }

        return i;
    }
}
