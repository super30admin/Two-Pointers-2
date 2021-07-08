// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem1;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int j = 1;
		int cnt = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				cnt++;
			} else {
				cnt = 1;
			}

			if (cnt <= 2) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	private void print(int[] nums, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		int[] nums = { 1, 1, 1, 2, 2, 3, 3, 3, 4 };
		System.out.println("Before Removing duplicates:");
		obj.print(nums, nums.length);
		System.out.println("After Removing duplicates:");
		int n = obj.removeDuplicates(nums);
		obj.print(nums, n);
	}

}
