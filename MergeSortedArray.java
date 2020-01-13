// Time complexity is O(m+n) as we are manipulating the whole array which is of size m+n
// Space complexity is O(1) as we are not using any extra space
//The solution is submitted on leetcode
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// edge case
		if (n == 0)
			return;
		int ptr1 = m - 1;
		int ptr2 = n - 1;
		int maxIndex = (m + n) - 1;
		while (ptr1 >= 0 && ptr2 >= 0) {
			// case1:
			if (nums1[ptr1] > nums2[ptr2]) {
				nums1[maxIndex] = nums1[ptr1];
				ptr1--;
			} else {
				nums1[maxIndex] = nums2[ptr2];
				ptr2--;
			}
			maxIndex--;
		}
		while(ptr2>=0) {
			nums1[maxIndex] = nums2[ptr2];
			maxIndex--;
			ptr2--;
		}

	}
}
