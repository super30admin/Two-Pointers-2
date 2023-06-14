package TwoPointers2;
/**
 * 
 * We use two pointer i and slow such that slow collects every element repeating twice and i goes
 * over each element.
 * 
 * 
 * Time Complexity :
 * O(n)
 * 
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem1 {
	public int removeDuplicates(int[] nums) {
		int slow = 0;
		int count = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[slow] == nums[i])
				count++;
			else
				count = 1;

			if (count <= 2) {
				slow++;
				nums[slow] = nums[i];
			}
		}

		return slow + 1;
	}
}
