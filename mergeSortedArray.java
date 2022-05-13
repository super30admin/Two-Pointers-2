
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // pointer from main array
        int mainPointer = m-1;
        // pointer from sub array
        int subPointer = n-1;
        // overall length of first array with 0 values
        int currIndex = (m+n)-1;
        // when pointers are greater than zero, loop through and compare
        while(mainPointer >=0 && subPointer >=0) {
            // if value at subPointer pos at nums2 is greater than value at mainPointer pos in nums1, copy that value to the last index of nums1
            if(nums2[subPointer] > nums1[mainPointer]) {
                nums1[currIndex] = nums2[subPointer];
                subPointer--;
            } else {
                // do the same above, but from the main pointer itself
                nums1[currIndex] = nums1[mainPointer];
                mainPointer--;
            }
            currIndex--;
        }
        // if there's any remaining elements left to consider from subArray after exhausting the main array
        // keep copying the values from subArray to main array
        while(subPointer >=0) {
            nums1[currIndex] = nums2[subPointer];
            subPointer--;
            currIndex--;
        }
    }
}