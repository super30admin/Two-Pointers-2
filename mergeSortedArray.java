// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 int p1 = m-1;
		 int p2 = n-1;
		 int p3 = m+n-1;
		 while(p2 >= 0 && p1 >= 0) {
			  if(nums1[p1] < nums2[p2]) {
					nums1[p3] = nums2[p2];
					p2--;
					p3--;
			  } else {
					nums1[p3] = nums1[p1];
					p1--;
					p3--;
			  }
		 }
		 while(p2 >= 0) {
			  nums1[p3] = nums2[p2];
			  p3--;
			  p2--;
		 }
	}
}