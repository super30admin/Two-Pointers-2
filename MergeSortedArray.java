
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : Take two pointers to compare the values of both the array and another pointer from the end to put the greater value
// between both the arrays.

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int idx = m+n-1;

        while( p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }
            else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        // if elements of nums2 are still left just move them to nums1
        while( p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}