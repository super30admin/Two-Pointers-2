// MERGE SORTED ARRAY

// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Start with 3 pointers, one each at the end of both the array indices and the other one pointing to the last element of the first array. Compare, put the one with the greater value into the last index and decrement/increment corresponding pointers.

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
            } else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        while(p2 >= 0){
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
    }
}