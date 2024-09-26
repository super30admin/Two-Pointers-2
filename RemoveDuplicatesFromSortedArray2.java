// Time Complexity : O(n) n-number of elements in the nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
	1. Initial pointers slow=0 and fast=slow+1
	2. if elements at slow and fast point to the same element
			indicate that the next elements that the fast points to, are duplicates(i.e unwanted duplicates)
			increment slow, put the element at fast to slow, and increment fast
	3. if elements at slow and fast DON'T point to the same element
			indicate that this is the first occurrence  of this number
			increment slow, put the element at fast to slow, and increment fast
*/

// Your code here along with comments explaining your approach


public class RemoveDuplicatesFromSortedArray2 {
	public int removeDuplicates(int[] nums) {
		// edge
		if (nums == null || nums.length < 3)
			return nums.length;

		// Flag to monitor if the element that fast is now pointing to, is 
		// an unwanted duplicate compared the element that slow is pointing.
		boolean isDuplicate = false;

		// pointers
		int slow = 0, fast = slow+1;

		while (fast < nums.length) {
			if (nums[slow] == nums[fast]) {
				if (!isDuplicate) {
					isDuplicate = true;
					nums[++slow] = nums[fast++];
				} else
					fast++;
			} else {
				isDuplicate = false;
				nums[++slow] = nums[fast++];
			}
		}
		return slow + 1;
	}
}