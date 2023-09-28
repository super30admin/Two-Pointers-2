//Leetcode Problem : https://leetcode.com/problems/merge-sorted-array/
// Time Complexity : O(n) where n is the maximum length of both arrays.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I set three pointers i = m-1, j = n-1 and k = nums1.length-1. I iterate while both
 * i and j >=0. If check whatever among nums1[i] and nums2[j] is greater and replace
 * nums1[k] with that value and decrement the respective i/j pointer. I also decrement the k
 * pointer. In case elements are still left in nums2, I copy all the elements of nums2 to nums1.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=nums1.length-1;
        while(i>=0 && j>=0)
        {
            if(nums2[j]>nums1[i])
            {
                nums1[k]=nums2[j];
                j--;
            }
            else
            {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }

        while(j>=0)
        {
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
}