// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We use three pointers: one at the end of the valid elements in nums1 (m - 1), one at the end of nums2 (n - 1), and one at the end of nums1 (m + n - 1).We compare the elements pointed to by nums1 and nums2 and place the larger one at the end of nums1.After placing the element, we move the corresponding pointer backward and continue until all elements from nums2 are merged

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m +n -1;
        while(len != -1) {
            if(n==0){
                break;
            }     
            if(m==0 || nums1[m-1] < nums2[n-1]) {
                nums1[len] = nums2[n-1];
                n--;
                len--;
                
            } else{
                nums1[len] = nums1[m-1];
                len--;
                m--;
               
            }
        }
    }
}

