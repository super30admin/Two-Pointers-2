// TC: O(m+n): m-> nums1.length, n -> nums2.length
// SC: O(1) - no extra space required
// Did it run successfully on Leetcode? : Yes
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0)
           return; 
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        while (p1 >= 0 && p2 >=0) 
        {
            if (nums2[p2] > nums1[p1])
            {
                nums1[p3--] = nums2[p2--];                
            }
            else
            {
                nums1[p3--] = nums1[p1--]; 
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1); 
    }
}
