//Time Complexity: O(m + n)
//Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n + m -1;
        int c = n -1;
        if(nums1 == null || nums2 == null || n == 0) return;


        while(c >= 0 && a >= 0)
        {

            if(nums1[a] > nums2[c])
            {
                nums1[b] = nums1[a];
                a--;
            }
            else{
                nums1[b] = nums2[c];
                c--;
            }
            b--;
        }
        while(c >= 0)
        {
            nums1[b] = nums2[c];
            b--;
            c--;
        }
    }
}