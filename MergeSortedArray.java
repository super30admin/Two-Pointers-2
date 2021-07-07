// Time Complexity : O((n+m)log(n+m)) For Merge and Sort and (O(N) for Other Approaches
// Space Complexity : O(1) for Merge and sort ,O(N) for 2st Approach,O(1) for 3rd Approach
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english


// Your code here along with comments explaining your approach
/*
Approach 1 Merge and Sort
Merge both list and sort.

Approach 2 Two Pointers/Start from beginning
We will use two pointer approach to sort and merge.We take auxillary array to store the 
merge sorted array and late copy the auxillary array back to first array

Aprroach 3 Two Pointers/Start from end
Here we start two pointers from end of  both array,keeping comparing and store them in first array.
This will avoid auxillary array.Hence space complexity is O(1)
*/
public class MergeSortedArray {
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
    	Arrays.sort(nums1);
	}

	public void merge2(int[] arr1, int n1, int[] arr2, int n2) {
		int arr3[] = new int[n1 + n2];
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < n1 && j < n2) {
			arr3[k] = arr1[i] <= arr2[j] ? arr1[i++] : arr2[j++];
			k++;
		}

		while (i < n1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];

		System.out.print(n1 + n2);
		// Store remaining elements of first array
		System.out.println(Arrays.toString(arr3));
		System.arraycopy(arr3, 0, arr1, 0, n1 + n2);
	}

	public void merge3(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		// set pointer for nums1
		int p = m + n - 1;
	
		// while there are still elements to compare
		while ((p1 >= 0) && (p2 >= 0)){
		  // compare two elements from nums1 and nums2 
		  // and add the largest one in nums1 
			nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
		}
		// add missing elements from nums2
		System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
	}



	public static void main(String args[]) {
		MergeSortedArray merge = new MergeSortedArray();
		int array1[] = { 1, 2, 3, 0, 0, 0 };
		int array2[] = { 2, 5, 6 };

		int size1 = array1.length - 1;
		int size2 = array2.length - 1;

		merge.merge1(array1, size1, array2, size2);
		merge.merge2(array1, size1, array2, size2);
		merge.merge3(array1, size1, array2, size2);

	}
}
