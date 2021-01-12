
/* 
 * Complexity of algorithm is O(n) ,where n is number of elements.
 *  
 * */

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		if (nums1 == null || nums1.length == 0)
			return;

		int idx = m + n - 1;

		int p1 = m - 1, p2 = n - 1;

		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] > nums2[p2]) {
				nums1[idx] = nums1[p1];
				p1--;
			} else {
				nums1[idx] = nums2[p2];
				p2--;

			}

			idx--;
		}

		while (p2 >= 0) {
			nums1[idx] = nums2[p2];
			idx--;
			p2--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		MergeSortedArray objIn = new MergeSortedArray();

		objIn.merge(nums1, m, nums2, n);

	}

}
