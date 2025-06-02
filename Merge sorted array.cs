/*
  Time complexity:O(m+n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

  Approach: nums1 and nums2 arrays are merged from the right. The elements in nums1 are m+n-1;

*/

public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int t = m+n-1;
        while(m>0 && n>0)
        {
            if(nums1[m-1]>=nums2[n-1])
            {
                nums1[t--] = nums1[m-1];
                m--;
            }
            else
            {
                nums1[t--]=nums2[n-1];
                n--;
            }
        }

        while(n>0)
        {
            nums1[t--]=nums2[n-1];
            n--;
        }
    }
}
