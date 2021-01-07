//Problem 38 : Merge Sorted Array 
// Time Complexity : O(m+n), m is total elements of array 1 and n stands for total elements of array 2
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
  Brute Force : Insert array 2 values in vacant spaces in array 1. Sort the whole array. TC=>O(nLogn), SC-> O(1) 
  Optimized : Use m and n as two pointers, Compare the values of array 1 and array 2 at m and n pointers respectively and insert max value of the comparison into array 1's last index and decrement the index as well as the used pointers value. Keep iterating until m>=0 and n>=0   
*/

class Solution38 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1==null || nums1.length==0 || nums2==null || nums2.length==0){
            return;
        }
        
        int i=nums1.length-1;
        m--;n--;
        
        while(m>=0 && n>=0){
            
            if(nums2[n]>nums1[m]){
                nums1[i] = nums2[n];
                n--;
            }else{
                nums1[i] = nums1[m];
                m--;
            }
            i--;
        }
        
        
        while(m>=0){
            nums1[i--] = nums1[m--];
        }
        
        while(n>=0){
            nums1[i--] = nums2[n--];
        }
    }
}