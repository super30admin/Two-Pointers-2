
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
	1. Pointers at m, n and end of first array
	2. See which among elements at m or n is greater
	3. Swap the larger element starting with the last index of bigger array
*/

// Your code here along with comments explaining your approach

class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		//Pointers at m and n to see which element is larger
		int i = m-1, j = n-1, k = m+n-1;

		//edge
		if (n == 0)
			return;

		while (i >= 0 && j >= 0) {
			//See which among elements at m or n is greater
			if (nums1[i] >= nums2[j])
				//Swap the larger element starting with the last index of bigger array
				nums1[k--] = nums1[i--];
			else
				//Swap the larger element starting with the last index of bigger array
				nums1[k--] = nums2[j--];
		}

		//If all bigger array are done, just copy the elements from the smaller array to the bigger array
		while (j >= 0)
			nums1[k--] = nums2[j--];

	}
}