
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/*
Approach:
========
Merge sort in reverse order so that larger elements are identified. Now, if elements in nums1 are smaller, let them be in their own
place. If not, as we already copied elements to larger indices, replace them with smaller elements of nums2.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int  index = nums1.length-1; //m+n-1
        int i = m-1, j = n-1; 
        while (i >= 0 && j >= 0) {
            if(nums2[j] > nums1[i]) { //If element compared in nums2 bigger than nums1, add it at nums1[index]
                nums1[index--] = nums2[j]; 
                j--;
            }
            else {
                nums1[index--] = nums1[i]; //Element compared in nums1 bigger than nums2, add it at nums1[index]
                i--;
            }
        }
        //copy any remaining elements from nums2 to nums1
        while(j != -1) {
            nums1[j] = nums2[j];
            j--;
        }
        
    }
}