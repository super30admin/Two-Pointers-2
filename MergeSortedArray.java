package MergeSortedArray;

/**
 * Approach: Compare the higher elements in both arrays and start filling nums1 from right to left with max elements
 * Time: O(m+n)
 * Space: O(1)
 * Leetcode accepted: yes
 * Problems faced: No
 */
public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		//Traverse nums1 from right to left
		for(int i=m+n-1; i>=0; i--) {
			//If both arrays have elements to be compared
			if(n>0 && m > 0) {
				if(nums1[m-1] > nums2[n-1]) {
					nums1[i] = nums1[m-1];
					m--;
				} else {
					nums1[i] = nums2[n-1];
					n--;
				}
			//If only the second array elements are left out
			} else if(m == 0 && n>0) {
				nums1[i] = nums2[n-1];
				n--;
			}
			//If only the first array elements are left out for comparison, they are already in place sorted.. so no need to compare them
		}
	}
	
	public static void main(String[] args) {
		int[] nums1 = {4,5,6,0,0,0};
		int m = 3;
		int[] nums2 = {1,2,3};       
		int n = 3;
		merge(nums1, m, nums2, n);
		for(int i=0; i<m+n; i++) {
			System.out.println(nums1[i]);
		}
	}

}
