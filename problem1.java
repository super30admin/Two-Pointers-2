
//Problem1- https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Maintain a count variable, according to desired k value and solve the questions with two pinter approach, taking both pointer at index =1

public class problem1 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int count = 1;
        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] == nums[fast - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
