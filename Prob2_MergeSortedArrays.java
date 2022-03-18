
// Time Complexity : O(m + n)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Maintaing 3 pointers : One for traversing from last element != 0 of nums1, last element of nums2 and
pointer for merging the arrays, which is pointed at last element in nums1

WHICHEVER element is greater between nums1 and nums2, will be copied at pointer we used for merge.
Till pointer is >= 0

IF some elements are left to copy from nums2 to nums2
We will simply copy one by one till all the elements are copied into nums1 


*/

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null)   return;
        
        int ptr1 = m - 1, ptr2 = n - 1, i = m + n - 1;
        
        while(ptr1 >= 0 && ptr2 >= 0){
            
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;
            }else{
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }
        
        while(ptr2 >= 0){
            nums1[i] = nums2[ptr2];
            i--; ptr2--;
        }
    }
}