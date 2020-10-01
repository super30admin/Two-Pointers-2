package com.javadwarf.sorting.leetcode;

public class _88_MergeSortedArray {

	public static void main(String[] args) {

		//merge(new int[] {}, 0, new int[] {}, 0);
		merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
		System.out.println();
		merge(new int[] {0}, 0, new int[] {1}, 1);
		System.out.println();
		
		merge(new int[] {4,5,6,0,0,0}, 3, new int[] {1,2,3}, 3);

	}
	
	
	//time o(n+m) and space o(1)
	// idea is to merge number from back, high to low
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		if(nums1 == null || nums2 == null || nums1.length==0 || nums2.length==0) return;		
		
		int x = m-1;
		int y = n-1;
		int v = nums1.length-1;
		
		while(x >=0 && y >=0) {
			
			if(nums1[x]<=nums2[y]) {
				nums1[v] = nums2[y];
				y--;
				v--;
				
			}
			else if(nums1[x]>nums2[y] ) {
				nums1[v] = nums1[x];
				x--;
				v--;
			}
			
		}
		
		for(int i=0; i<=y; i++) {
			nums1[i] = nums2[i];
		}

		for(int z : nums1) {
			System.out.print(z +" ");
		}
	}
	

}
