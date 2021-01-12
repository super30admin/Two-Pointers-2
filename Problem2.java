class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
            Start with end indexes
            Time complexity - O(m+n)
            Space complexity - O(1)
         **/

        if(m==0)
        {
            System.arraycopy(nums2,0,nums1,0, n);
            return;
        }

        if(n==0)
            return;

        int i = m!=0 ? m-1 : 0;
        int j = n-1;
        int k = m+n-1;

        while(i>=0&&j>=0)
        {
            if(nums2[j]>nums1[i])
            {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
            else if(nums2[j]<nums1[i])
            {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else
            {
                nums1[k]=nums1[i];
                j--;
                // i--;
                k--;
            }
        }

        while(j>=0&&k>=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }

    }
}