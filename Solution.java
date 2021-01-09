// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int high = m + n - 1;
        while(high>=0)
        {
            if(p1>=0 && p2>=0 && (nums1[p1] < nums2[p2]))
            {
                nums1[high] = nums2[p2];
                high--;
                p2--;
            }
            else if(p1>=0)
            {
                nums1[high] = nums1[p1];
                high--;
                p1--;
            }
            if(p1<0 && p2>=0)
            {
                nums1[high] = nums2[p2];
                high--;
                p2--;
            }
        }
    }
}