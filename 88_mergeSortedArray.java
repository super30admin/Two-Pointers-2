
    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
    Time Complexity for operators : o(m+n) .. total size
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : hashmap to store the counts of elements and then check if it is greate than 2 then 
                           avoid else add to array.
        # Optimized approach: 
                              
            # 1. 
                    A) Get all the lengths of two arrays and the full array as well.
                    B) Start from bigger side that is end of the array.
                    C) If nums1> nums2 then add nums1 element to the end of nums1. decrement i.
                    D) Else add nums2 at the end. decrement j. Also deduct total.
                    E) At the end, check if we convered all elements of 2nd array or not else att that in the array.
    */ 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; int j = n-1; int total = m+n-1;
        
        while(i>=0 && j>=0){
            
            if(nums1[i]>nums2[j]){
                nums1[total] = nums1[i]; 
                i--;
            }else{
                nums1[total] = nums2[j];
                j--;
            }
            
            total --;
        }
        
        while(j>=0){
            nums1[total] = nums2[j];
            j--;
            total--;
        }
    }
}