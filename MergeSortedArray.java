// Time Complexity : O( (m + n) log(m + n) )
// Space Complexity : O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int gap = (int)Math.ceil((m + n) / 2.0);

        if(nums2.length > nums1.length)
        {
            int [] temp = nums1;
            nums1 = nums2;
            nums2 = nums1;

            int x = m;
            m = n;
            n = x;
        }

        for(int i = m; i < m + n; i++) nums1[i] = nums2[i - m];

        while(gap > 0)
        {
            for(int i = 0; i + gap < m + n; i++)
            {
                if(nums1[i] > nums1[i + gap])
                {
                    int temp = nums1[i];
                    nums1[i] = nums1[i + gap];
                    nums1[i + gap] = temp;
                }
            }

            if(gap == 1) gap = 0;

            else gap = (int)Math.ceil((gap / 2.0));
        }
    }
}