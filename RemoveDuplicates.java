// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//  - when element is diff from previous element, count will be reset to 1.
//  - for same elements, count will be incrementing.
//  - until k count, elements will be swapped for slow and fast pointers.

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 1, slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast - 1] == nums[fast])
                count++;
            else
                count = 1;
            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
