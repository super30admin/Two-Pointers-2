/*
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/


// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Beats 100% submissions


//append to nums1 from end of nums1 by comparing the values of nums1 and nums2 from the end of their list

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums2 == null || n == 0)  return; // If nums2 is empty or null
        
        
        while(n > 0){
            
            if(m > 0 && nums1[m - 1] > nums2[n - 1]){
                
                nums1[n + m - 1] = nums1[m - 1];
                m--;
            }else{
                
                nums1[n + m - 1] = nums2[n - 1];
                n--;
            }
        }
    }
}

//Another Approach


//Beats 100 % of submissions
//Make sure to check the empty and null array for both the arrays.


//Approach: Iterate through the first array. For every value greater then the first element of the second array swap them and sort the second array.
//Repeat until the first array and then just join the second array to the first.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        if(nums1 == null || nums1.length == 0)  return;
        if(nums2 == null || nums2.length == 0) return;
        
        int i;
        
        for(i = 0; i < nums1.length - nums2.length; i++){
            
            if(nums1[i] > nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
                sort(nums2);
            }
        }
        
        for(int j = 0; j < nums2.length; j++){
            nums1[i] = nums2[j];
            i++;
         }
    }
    
    void sort(int[] nums2){
        
        int i = 1;
        while(i < nums2.length && nums2[i] < nums2[i - 1]){
            int tmp = nums2[i];
            nums2[i] = nums2[i - 1];
            nums2[i - 1] = tmp;
            i++;
        }
    }
}
