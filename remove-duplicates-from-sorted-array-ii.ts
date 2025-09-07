// Time complexity - O(n)
// Space complexity - O(1)
function removeDuplicates(nums: number[]): number {
	let slow = 1;
	let count = 1;

	for (let i = 1; i < nums.length; i++) {
		if (nums[i] === nums[i - 1]) {
			count++;
		} else {
			count = 1;
		}

		if (count <= 2) {
			nums[slow] = nums[i];
			slow++;
		}
	}
	return slow;
}
