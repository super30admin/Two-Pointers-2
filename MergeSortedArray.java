// Time Complexity : O(n+m). m and n is the length of the first and second array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null
				|| nums1.length==0 || nums2.length==0)
			return;
		int i = m-1, j = n-1,k=m+n-1;
		while (i>=0 && j>=0) {
			if(nums2[j]>nums1[i]) {
				nums1[k]=nums2[j];
				j--;k--;
			}else {
				nums1[k]=nums1[i];
				k--;i--;
			}
		}
		if(i>=0) {
			for(int f=i;f>=0&&k>=0;f--,k--) {
				nums1[k]=nums1[f];
			}
		}else if(j>=0) {
			for(int f=j;f>=0&&k>=0;k--,j--) {
				nums1[k]=nums2[j];
			}
		}
    }
}
