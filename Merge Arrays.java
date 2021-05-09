class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c1 = m-1;
        int c2 = n-1;
        int c = m+n-1;
        while(c1>=0 && c2>=0)
        {
           if(nums1[c1]<nums2[c2])
           {
               nums1[c] = nums2[c2];
               c2--;
           }
            else
            {
                nums1[c] = nums1[c1];
                c1--;
            }
            c--;
        }
        while(c2 >= 0)
        {
            nums1[c] = nums2[c2];
            c2--;
            c--;
        }
    }
}