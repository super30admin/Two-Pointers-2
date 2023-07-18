// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Use three pointers and start from the end. One pointer is to keep track of first array, second pointer is for second array and third pointer is for the result. Keep putting the element which is greater amongst the two arrays starting from the end. If we reach the end of one array, just put all the remaining elements of the other array into the result

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Three pointers to keep track of first array, second array and result array
        int a = m - 1;
        int b = n - 1;
        int i = m + n - 1;

        // Loop will run till we reach the end of one of the array
        while (a >= 0 && b >= 0) {
            // Put the element which is greater in the result
            if (nums1[a] > nums2[b]) {
                nums1[i] = nums1[a];
                a--;
            } else {
                nums1[i] = nums2[b];
                b--;
            }
            i--;
        }

        // Put the remaining elements of the other array if one array ended
        while (a >= 0) {
            nums1[i] = nums1[a];
            i--;
            a--;
        }

        while (b >= 0) {
            nums1[i] = nums2[b];
            i--;
            b--;
        }
    }
}