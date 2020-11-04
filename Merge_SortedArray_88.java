//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Merge_SortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0)
        	return;
        int len = m+n-1;
        int ptr1 = m-1;
        int ptr2 = n-1;
        while(ptr1 >= 0 && ptr2 >= 0)
        {
        	if(nums1[ptr1] > nums2[ptr2])
        	{
        		nums1[len] = nums1[ptr1];
        		ptr1--;
                
        	}
        	else
        	{
        		nums1[len] = nums2[ptr2];
        		ptr2--;
        	}
        	len--;
        }
        
        while(ptr2 >= 0)
        {
        	nums1[len] = nums2[ptr2];
    		len--;
            ptr2--;
        }

    }
    
    public static void main(String[] args)
    {
    	int m = 3;
    	int n = 3;
    	int[] nums1 = new int[m+n];
    	int[] nums2 = {2,5,6};
    	nums1[0] = 1;
    	nums1[1] = 2;
    	nums1[2] = 3;
    	Merge_SortedArray_88 sort = new Merge_SortedArray_88();
    	
    	sort.merge(nums1,  m,  nums2,  n);
    	
    }
}
