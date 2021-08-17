using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class MergeTwoSortedArraysLC
    {
        //Time Complexity: O(m+n)
        //Space Complexity:O (1)
        public void Merge(int[] nums1, int m, int[] nums2, int n)
        {
            if (nums1 == null && nums2 == null)
            {
                return;
            }
            int i = m - 1, j = n - 1, k = m + n - 1;
            while (i >= 0 && j >= 0)
            {
                if (nums1[i] > nums2[j])
                {
                    nums1[k] = nums1[i];
                    k--;
                    i--;
                }
                else
                {
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }
            }
            while (j >= 0)
            {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
}
