// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        int c = m+n-1;
        while(a>=0 && b>=0){
            if(nums1[a]>nums2[b]){
                nums1[c] = nums1[a];
                a--;
            }
            else{
                nums1[c] = nums2[b];
                b--;
            }
            c--;
        }
        while(b>=0){
            nums1[c] = nums2[b];
            b--;
            c--;
        }
    }
}
