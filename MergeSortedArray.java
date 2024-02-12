//TC - O(m+n)
//SC - O(1)

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int z = m + n - 1;
		int x = m - 1;
		int y = n - 1;
		while (x >= 0 && y >= 0) {
			if (nums1[x] >= nums2[y]) {
				nums1[z] = nums1[x];
				z--;
				x--;
			} else {
				nums1[z] = nums2[y];
				z--;
				y--;
			}
		}
		while (y >= 0) {
			nums1[z] = nums2[y];
			z--;
			y--;
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
		
		for(int i:nums1) {
			System.out.println(i);
		}

	}

}
