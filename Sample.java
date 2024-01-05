
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain English
// Two pointers to iterate arrays in reverse and one to keep track of where to input in nums1

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m < 1) {
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }

        int a = m-1;
        int b = n-1;
        int insert = nums1.length - 1;

        while(a >= 0 || b >= 0){
            int numa = a > -1 ? nums1[a] : Integer.MIN_VALUE;
            int numb = b > -1 ? nums2[b] : Integer.MIN_VALUE;
            if(numa > numb){
                nums1[insert--] = numa;
                a--;
            } else {
                nums1[insert--] = numb;
                b--;
            }
        }

    }
}
