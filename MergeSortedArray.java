package Nov4;

class MergeSortedArray {
    
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        
/* 
	Time Complexity: O(m+n) where m and n are no.of elements in nums1 and nums2 array.
	Because we will iterate through all m and n elements of nums1 and nums2 array for comparing and placing it in nums1 array accordingly.

	Space Complexity: O(1)
	No extra space used, so O(1).
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
    Two pointers approach used where one pointer each(i and j) is used in each of the arrays to iterate through them. Another pointer(k) is used to track the position of sorted elements in nums1 array as they are placed one after another.
 
*/
        
        // edge
        if (nums1 == null || nums1.length == 0) {
            return;
        }
        
        int i = m-1;
        int j = n-1;
        int k = m+n -1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // if nums2 array has one or more elements which are lesser than the first elements of nums1 array, they will be left out in the previous while loop. Below loop takes care of those elements.
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
    }
}
