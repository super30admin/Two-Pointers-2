
/* 
 * Complexity of algorithm is O(n) ,where n is number of elements.
 *  
 * */

public class RemoveDuplicatesfromSortedArrayII {

	public int removeDuplicates(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;
		int count = 1, j = 1;
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
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 2, 2, 3 };

		RemoveDuplicatesfromSortedArrayII objIn = new RemoveDuplicatesfromSortedArrayII();

		objIn.removeDuplicates(nums);

	}

}
