/**
 * Time:O(n)
 * Space: O(1)
 * Leetcode accepted: yes
 * Problems faced: No
 */
public class RemoveDupsSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,4};
		System.out.println(removeDuplicates(nums));
	}
/**
 * 3-pointers: prev, slow, fast
 * prev - points to the latest non repeated element
 * fast - takes one step at a time to evaluate the current element against the last non-repeated element(prev)
 * slow - points an index before which the elements are sorted and not repeated more than twice(solution)
 * flag - to show whether the current element occurred more than once
 * @return
 */
	private static int removeDuplicates(int[] nums) {
		int slow = 1, fast = 1, prev = 0;
		boolean flag = false; //set to true if an element is repeated
		//Terminating condition: until fast reaches the end of the array
		while(fast < nums.length) {
			//check if curr element fast points to is equal to that of previously set non repeated element
			if(nums[prev] == nums[fast]) {
				//Element repeated for the first time
				if(!flag) {
					flag = true; //element is now repeated
					nums[slow] = nums[fast]; //Replace slow with the current element
					slow++;
					fast++;
				} else { // Element repeated more than once.
					fast++; //Ignore and move the fast pointer
				}
			//If the fast pointer points to a new non-repeated element	
			} else {
				prev = fast; //Move prev to point to this new non repeated element
				nums[slow] = nums[fast]; //slow should be replaced with the new element and then be incremented
				fast++;
				slow++;
				flag = false; // Reset the flag to false as the new element is found
			}
		}
		return slow;
	}
}
