// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english


/**
 * Iterate over each index and maintain a variable to store the numbers
 * in correct index. if that variable -2 index is not matching with current
 * index then push that number to varible index and increment it. Finally
 * return the variable.
 *
 */
class Solution {
	public int removeDuplicates(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (j == 0 || j == 1 || nums[j - 2] != nums[i]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
}
