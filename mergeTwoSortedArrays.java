//TC : O(m+n) SC: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2==null) return;
        int r1 = nums1.length-1; //0
        int r2 = nums2.length-1; // 0
        int l1 = r1 - r2 - 1; //-1

        while(l1 >= 0 && r2 >=0)
        {
            if(nums2[r2] > nums1[l1])
            {
                nums1[r1] = nums2[r2];
                r2--;
                r1--;
            }
            else
            {
                nums1[r1] = nums1[l1];
                l1--;
                r1--;
            }
        }

        while(l1>=0)
        {
            nums1[r1] = nums1[l1];
            l1--;
            r1--;
        }

        while(r2>=0)
        {
            nums1[r1] = nums2[r2];
            r2--;
            r1--;
        }
    }
}