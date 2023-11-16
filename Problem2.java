
// Time Complexity : O(m+n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  Yes

//put i to left of 0's
// j to last of nums2
// k to last of nums1
// k is the running pointer
// We will compare elements at i and j and add them accordingly to k and decrement accordingly.
// Do this until both the arrays are available.
// If nums2 is exhausted then numbers of nums1 are already in theri position so we do nothing
// If nums1 is exhausted just override all the element with that of nums2 since the numbers 
// which are getting overrided are already placed to the end of the nums1. So no problem


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1, j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(k>=0 && j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}