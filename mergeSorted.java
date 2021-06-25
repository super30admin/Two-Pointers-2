
// Time Complexity : o(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int k = m + n -1;
        while(ptr1 >=0 && ptr2 >=0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[k] = nums1[ptr1];
                k--;ptr1--;
            }
            else{
                nums1[k] = nums2[ptr2];
                 k--;ptr2--;
            }
        }
        while(ptr2 >= 0){
            nums1[k] = nums2[ptr2];
            k--; ptr2--;
            }
    }
}