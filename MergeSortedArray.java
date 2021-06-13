
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// take 2 pointers from the end of each array and update the elements after comparing them
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(nums1[i] > nums2[j])
				nums1[k--] = nums1[i--];
			else
				nums1[k--] = nums2[j--];
		}
		
        while(j>=0)
			nums1[k--] = nums2[j--];
    }
}