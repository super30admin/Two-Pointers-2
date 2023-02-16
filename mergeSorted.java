
// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//used two pointer to traverse in descending order and 
// fill all the values in the decreaseing order

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1;
        int n2 = n - 1;
        while (true) {
            if (n2 == -1)
                return;
            if (n1 == -1)
                break;
            if (nums2[n2] > nums1[n1])
                nums1[n1 + n2 + 1] = nums2[n2--];
            else
                nums1[n1 + n2 + 1] = nums1[n1--];

        }
        while (n2 != -1) {
            nums1[n2] = nums2[n2];
            n2--;
        }
        return;
    }
}