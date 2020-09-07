// Time Complexity : O(M+N) as we are going through both the arrays once.
// Space Complexity : O(1) as we are using just two pointers.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :
        //Since we have to merge the two sorted arrays,
        //first intuition is to use two pointers starting from 0
        //of each array. But this leads to issue of having to move elements
        //in the larger array. Hence I thought of starting from the last index
        //and filled up the larger array in sorted manner.

class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) {
            return;
        }

        //start from last index of each sorted array as otherwise
        //we will have to move elements when we find smaller element
        //from the shorter array.
        int pointerOne = m-1;
        int pointerTwo = n-1;
        
        for(int i = m + n - 1; i >= 0; i-- ) {
            if(pointerOne >= 0 && (pointerTwo < 0 ||
                    nums1[pointerOne] >= nums2[pointerTwo])) {
                nums1[i] = nums1[pointerOne--];
            } else {
                nums1[i] = nums2[pointerTwo--];
            }
        }
        
        return;
    }
}