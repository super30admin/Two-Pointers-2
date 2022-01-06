package twoPointers2;

import java.util.Arrays;

public class MergeSortedArray {
	//Time Complexity : O(n+m), where n is the length of nums1 array and m is the length of nums2 array
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Having 3 pointers and traversing till the end of
	//nums1 array
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = nums1.length - 1;
        int k = n - 1;
        
        while(j >= 0 && k >= 0) {
            if(i >= 0 && nums1[i] > nums2[k])
                nums1[j--] = nums1[i--];
            else
                nums1[j--] = nums2[k--];
        }
    }
	
	//Time Complexity : O((n-m)logn), where n is the length of nums1 array and m is the length of
	//nums2 array
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this: No
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int j = n - 1;
        for(int i=nums1.length-1; i>=m; i--) {
            nums1[i] = nums2[j--];
        }
        
        Arrays.sort(nums1);
    }
}
