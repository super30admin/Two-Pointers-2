// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//	1. Set pointers to end of both arrays and idx pointer for new elements after sorting 
//	2. Put the largest values at the available locations given in nums1
//	3. If any more elements in nums2, replace in nums1
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int idx = m + n - 1;
        while(ptr1 >= 0 && ptr2 >= 0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[idx] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[idx] = nums2[ptr2];
                ptr2--;
            }
            idx--;
        }
        while(ptr2 >= 0){
            nums1[idx] = nums2[ptr2];
            ptr2--;
            idx--;
        }
    }
}