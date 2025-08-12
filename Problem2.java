

// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


// We use three pointers to keep track of the current index in each array.
// We compare the elements at the current indices and insert the larger one into the merged array.
// i -> tracks the last valid element in nums1 
// j -> tracks the last element in nums2 
// k -> tracks the last index of nums1 where we place the next largest element

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else
                nums1[k--]=nums2[j--];
        }
    }
}