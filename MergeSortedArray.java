/*
Author: Akhilesh Borgaonkar
Problem: LC 88. Merge Sorted Array (Two-Pointers-2)
Approach: Using two-pointers approach here. I am comparing the largest numbers in both arrays and then placing the highest value element in the
    end index of nums1 array. After the comparison is complete, if the elements are still left in nums2 array then, simply copy it to the nums1.
Time Complexity: O(m+n) where m & n are number of elements in input array nums1 and nums2 resp.
Space complexity: O(1) constant as we use the same nums1 array to merge.
LC verified.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1 , right=m+n-1; //count
        int i = n-1; //ptr2
        
        while(left>=0 && i>=0){
            if(nums2[i] > nums1[left]){
                nums1[right] = nums2[i];
                right--;
                i--;
            }
            else {
                nums1[right] = nums1[left];
                right--;
                left--;
            }
        }
        
        while(i >= 0){
            nums1[right]=nums2[i];
            right--;
            i--;
        }
        
    }
}