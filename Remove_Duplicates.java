
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.Arrays;

public class Remove_Duplicates {
	/*
	 * In this function we assign to variable j and count and we traverse through
	 * the nums array, and at each iteration we check if the current element is
	 * equal to previous element, if so we increase the count, else we set the count
	 * to 1. and if count is lesser than or equal to 2 we assign nums[j] = nums[i]
	 * and increase j
	 */
	public static int removeDuplicates(int[] nums) {
		int j = 1;
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count <= 2) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 2, 2, 3 };
		System.out.println(Arrays.toString(nums));
		int result = removeDuplicates(nums);
		System.out.println(result);
	}
}