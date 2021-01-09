// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Begin sorting from the back of the two arrays to preserve sorted ordering. Then we only need to check if p2 pointer is in bounds after the first
// loop since the final answer is going to be put into nums1 anyways, meaning if p2 pointer is finished and p1 pointer is not, we have our result already.

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) return;
        int p1 = m-1;
        int p2 = n-1;
        int idx = (m+n)-1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
                idx--;
            }else{
                nums1[idx] = nums2[p2];
                idx--;
                p2--;
            }
        }
        
        while(p2 >= 0){
            nums1[idx--] = nums2[p2--];
        }
        
    }
}