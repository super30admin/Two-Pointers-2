
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*

This approach merges two sorted arrays in-place, starting from the end to avoid
overwriting elements in nums1. By using three pointers—first for nums1, second for nums2,
and last for the final position—the largest elements are placed at the correct position
from right to left. If nums1[first] is greater, it moves to the last position; otherwise,
nums2[second] takes that spot. Once nums1 is exhausted, any remaining elements from nums2
are copied directly. This results in an O(n) time complexity with O(1) space, making it
efficient for merging two sorted arrays.

*/

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first=m-1;
        int second=n-1;
        int last=nums1.length - 1;
        while(first>=0 && second>=0)
        {
            if(nums1[first]>=nums2[second])
            {
                nums1[last--]=nums1[first--];
            }
            else
            {
                nums1[last--]=nums2[second--];
            }
        }

        while(second>=0)
        {
            nums1[last--]=nums2[second--];
        }
    }
}