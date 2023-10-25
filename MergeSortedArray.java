// Time Complexity : O(M+N) where M length of nums1 array & N is length of nums2 array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class MergeSortedArray
{
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n)
        {
            int lastIdx = m+n-1;
            int num1 = m-1, num2 = n-1;
            while(num1 >=0  && num2 >= 0)
            {
                if(nums1[num1] > nums2[num2])
                {
                    nums1[lastIdx] = nums1[num1];
                    num1--;
                }
                else
                {
                    nums1[lastIdx] = nums2[num2];
                    num2--;
                }
                lastIdx--;
            }
            while(num2 >= 0)
            {
                nums1[num2] = nums2[num2];
                num2--;
            }
        }
    }
}
