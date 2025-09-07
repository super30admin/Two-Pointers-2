// Time complexity - O(m+n)
// Space complexity - O(1)
function merge(nums1: number[], m: number, nums2: number[], n: number): void {
	let p1 = m - 1;
	let p2 = n - 1;
	let k = m + n - 1;

	while (p2 >= 0) {
		if (nums1[p1] > nums2[p2]) {
			nums1[k] = nums1[p1];
			p1--;
		} else {
			nums1[k] = nums2[p2];
			p2--;
		}
		k--;
	}
}
