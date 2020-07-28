
public class Merge_Sorted_Array {
	//Approach: 1. Here we use 3 pointers, ptr -> acts as indicator to mention all the elements after that pointer is sorted. We start filling nums1 arraywith maximum elements and 
	//keep decreasing the pointers. 
	//2. So ptr1 and ptr2 will keep iterating over elements of nums1 and nums2 whichever is maximum of that will get filled in the ptr position of nums1. 
	//3. when ptr1 goes out of array and we still have elements in nums2, we then fill those directly in the ptr position of nums1.
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int ptr1 = m-1, ptr2 = n-1, ptr = m+n-1; 
	        while(ptr1 >=0 && ptr2 >= 0)
	        {
	            if(nums1[ptr1] > nums2[ptr2])
	            {
	                nums1[ptr] = nums1[ptr1];
	                ptr--;
	                ptr1--;
	            }
	            else
	            {
	                nums1[ptr] = nums2[ptr2];
	                ptr--;
	                ptr2--;
	            }
	        }
	        while(ptr2 >= 0)
	        {
	            nums1[ptr] = nums2[ptr2];
	            ptr--;
	            ptr2--;
	        }
	    }
	//Time Complexity : O(n) 
	//Space Complexity : O(1) 
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this :
	 
	 public void merge1(int[] nums1, int m, int[] nums2, int n) {
		 //Approach: Here I use an extra space and create an copy of nums1. now we have nums1 and nums2 in separate arrays and start comparing their minimum elements and start filling from
		 //0th index of nums1 thus overiridng the entire array with sorted elements from num1_copy and nums2.
	        //creating a copy of nums1
	        int[] nums1_copy = new int[m];
	        //copy elements
	        System.arraycopy(nums1,0, nums1_copy,0, m );
	        
	        //pointers to traverse array
	        int p=0, p1=0,p2=0;
	        while(p1<m && p2 < n)
	        {
	            nums1[p++] = nums1_copy[p1] <= nums2[p2] ? nums1_copy[p1++]: nums2[p2++];
	        }
	        if(p1<m)
	            System.arraycopy(nums1_copy, p1, nums1,p, m-p1);
	        if(p2<n)
	            System.arraycopy(nums2, p2, nums1,p, n-p2);
	    }
}
//Time Complexity : O(n) 
//Space Complexity : O(n) since we are creating another array for nums1.  
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :
