
// Time Complexity :O(m+n)- Iterating both the arrays
// Space Complexity :O(1) - Merged in given array
// Did this code successfully run on Leetcode :Yes
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
//Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Merge Sorted Array.

//Start iterating from last index of nums1 & nums2 array. If the value in nums1 is greater nums2, then 
//store the value of nums1 in last index of nums1, similarly if the value is less than nums2 then place nums2 value
//in last index nums1.
import java.util.*;
import java.io.*;


public class Problem2_MergeSortedArray {
	
	    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        //Decrement the value of m & n by 1 to match with the indexes
	        n--;
	        m--;
	        //Continue the loop until nums1 array is exhausted
	        while(n >=0){
	            //Check if value at nums1 is greater than nums2
	            //If yes then assign it to last index of nums1 array
	            if(m>=0 && nums1[m] > nums2[n]){
	                nums1[m+n+1] = nums1[m];
	                m--;
	            }else{
	                nums1[m+n+1] = nums2[n];
	                n--;
	            }
	        }    
	    }
	    
	    public static void main(String[] args) {
	    		int[] nums1 = {1,2,3,0,0,0};
	    		int[] nums2= {2,5,6};
	    		
	    		int m= 3;
	    		int n= nums2.length;
	    		merge(nums1,m,nums2,n);
	    		System.out.println("Merged Sorted Array: ");
	    		for(int i=0; i< m+n; i++) {
	    			System.out.print(nums1[i]+ " ");
	    		}
	    }
	}


