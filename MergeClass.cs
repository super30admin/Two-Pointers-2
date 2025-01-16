public class Solution
{
    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        if (nums2 == null || nums1 == null)
        {
            return;
        }

        int p1 = m - 1, p2 = n - 1, p3 = m + n - 1;
        while (p1 >= 0 && p2 >= 0)
        {
            nums1[p3] = Math.Max(nums1[p1], nums2[p2]);
            p3--;
            if (nums1[p1] > nums2[p2])
            {
                p1--;
            }
            else
            {
                p2--;
            }
        }

        while (p2 >= 0)
        {
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}