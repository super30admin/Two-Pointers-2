// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        int ptr = nums1.length - 1;
        while(first >= 0 && second >= 0){
            if(nums1[first] > nums2[second]){
                nums1[ptr] = nums1[first];
                first--;
                ptr--;
            }else{
                nums1[ptr] = nums2[second];
                second--;
                ptr--;
            }
        }

        while(second >= 0){
            nums1[ptr] = nums2[second];
            second--;
            ptr--;
        }
    }
}
