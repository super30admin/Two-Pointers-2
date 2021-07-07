package com.BigN;
// Time complexity is O(n) as we are only manipulating the pointers
// Space complexity is O(1) as we are not using any extra space
// This solution is submitted on leetcode
// This is an inplace algorithm
public class TwiceDuplicatesInArrayBigN38 {
	public int removeDuplicates(int[] nums) {
		// edge case
		if (nums.length == 0 || nums == null)
			return 0;
		int slow = 0;
		int fast = 1;
		boolean flag = false;
		while (fast < nums.length) {
			// case 1:
			if (nums[slow] == nums[fast]) {
				if (!flag) {
					flag = true;
					slow++;
					nums[slow] = nums[fast];
					fast++;
				} else {
					while (fast < nums.length && nums[fast-1] == nums[fast]) {
						fast++;
					}
				}
			} else {
				flag = false;
				slow++;
				nums[slow] = nums[fast];
				fast++;
			}
		}
		return slow + 1;
	}
}
